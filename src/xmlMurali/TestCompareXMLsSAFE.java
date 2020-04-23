package xmlMurali;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestCompareXMLsSAFE {
	private static final String FAILURE = "Invalid XMLS";
	private static final String SUCCESS = "valid XMLS";

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		Document sourceDoc = getDocumentinstance("employeeAddr1.xml");
		Document targetDoc = getDocumentinstance("employeeAddr2.xml");

		Element sourceRoot = sourceDoc.getDocumentElement();
		Element targetRoot = targetDoc.getDocumentElement();

		// System.out.println(sourceRoot.getNodeName());
		if (!sourceRoot.getNodeName().equals(targetRoot.getNodeName())
				|| sourceRoot.getChildNodes().getLength() != sourceRoot.getChildNodes().getLength()) {
			System.out.println(FAILURE);
		} else {
			try {
				travesrseAllNodes(sourceRoot.getChildNodes(), targetRoot.getChildNodes());
				System.out.println(SUCCESS);
			} catch (XMLCompareFailure e) {
				System.out.println(e.getMsg());
				System.out.println(FAILURE);
			}
		}
	}

	private static void travesrseAllNodes(NodeList sourceList, NodeList targetList) throws XMLCompareFailure {
		validateElementsSize(sourceList, targetList);
		
		for (int temp = 0; temp < sourceList.getLength(); temp++) {
			Node sourceNode = sourceList.item(temp);
			if (sourceNode.getNodeType() == Node.ELEMENT_NODE) {
				String elementName = sourceNode.getNodeName();

				Node targetNode = getNode(elementName, targetList, temp);

				if (isSimpleElement(sourceNode) && !sourceNode.getTextContent().equals(targetNode.getTextContent())) {
					throw new XMLCompareFailure("compare failed for" + elementName);
				}

				if (sourceNode.hasChildNodes()) {
					travesrseAllNodes(sourceNode.getChildNodes(), targetNode.getChildNodes());
				}
				
				compareAttributes(sourceNode, targetNode);
			}
		}
	}

	private static void validateElementsSize(NodeList sourceList, NodeList targetList) throws XMLCompareFailure {
		if (sourceList.getLength() != targetList.getLength()) {
			throw new XMLCompareFailure("elements size mismatch");
		}
	}

	private static Node getNode(String elementName, NodeList targetList, int t) throws XMLCompareFailure {
		if (targetList.getLength() < t) {
			throw new XMLCompareFailure("targetList has less elements" + elementName);
		}
		for (int temp = t; temp < targetList.getLength(); temp++) {
			Node sourceNode = targetList.item(temp);
			if (sourceNode.getNodeType() == Node.ELEMENT_NODE) {
				String targetElementName = sourceNode.getNodeName();
				if (elementName.equals(targetElementName)) {
					return sourceNode;
				}
			}
		}
		throw new XMLCompareFailure("element not found. -->" + elementName);
	}

	private static boolean isSimpleElement(Node node) {
		return node.getChildNodes().getLength() == 1;
	}

	private static void compareAttributes(Node source, Node target) throws XMLCompareFailure {
		List<String> columns1 = getColumns(source);
		List<String> columns2 = getColumns(target);

		checkAttributeDifferences(columns1, columns2);
		checkAttributeDifferences(columns2, columns1);

		if (source.hasAttributes()) {
			NamedNodeMap attributes = target.getAttributes();

			NamedNodeMap nodeMap = source.getAttributes();
			for (int i = 0; i < nodeMap.getLength(); i++) {
				Node sourceNodeAttr = nodeMap.item(i);
				String nodeName = sourceNodeAttr.getNodeName();
				if (nodeName.equalsIgnoreCase("id")) {
					continue;
				}
				Node targetNode = attributes.getNamedItem(nodeName);
				if (targetNode == null) {
					throw new XMLCompareFailure("invalid attribute name" + nodeName);
				}

				if (!sourceNodeAttr.getNodeValue().equals(targetNode.getNodeValue())) {
					throw new XMLCompareFailure("invalid attribute value for" + sourceNodeAttr.getNodeName());
				}
			}
		}
	}

	private static Document getDocumentinstance(String xml)
			throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File(xml));
		document.getDocumentElement().normalize();
		return document;
	}

	public static List<String> getColumns(Node node) {
		List<String> columns = new ArrayList<>();
		if (node.hasAttributes()) {
			NamedNodeMap nodeMap = node.getAttributes();
			for (int i = 0; i < nodeMap.getLength(); i++) {
				Node sourceNodeAttr = nodeMap.item(i);
				String nodeName = sourceNodeAttr.getNodeName();
				if(nodeName.equalsIgnoreCase("id")) {
					continue;
				}
				columns.add(nodeName);
			}
		}
		return columns;
	}

	private static void checkAttributeDifferences(List<String> attributes1, List<String> attributes2)
			throws XMLCompareFailure {
		List<String> missing = new ArrayList<String>();
		attributes2.forEach(data -> {
			if (!data.equals("id") && !attributes1.contains(data)) {
				missing.add(data);
			}
		});

		if (!missing.isEmpty()) {
			throw new XMLCompareFailure("mismatching attributes found..");
		}
	}
}
