package xmlMurali;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestCompareXMLsDuplicates {

	private static final String FAILURE = "Invalid XMLS";
	private static final String SUCCESS = "valid XMLS";

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		Document sourceDoc = getDocumentinstance("employeeAddr1.xml");
		Document targetDoc = getDocumentinstance("employeeAddr2.xml");

		Element sourceRoot = sourceDoc.getDocumentElement();
		Element targetRoot = targetDoc.getDocumentElement();

		if (!sourceRoot.getNodeName().equals(targetRoot.getNodeName())) {
			System.out.println(FAILURE);
		} else if (getItems(sourceRoot).equals(getItems(targetRoot))) {
			System.out.println(SUCCESS);
		} else {
			System.out.println(FAILURE);
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
	
	private static Items getItems(Node source) {
		NodeList sourceList = source.getChildNodes();
		Items items = new Items();
		for (int temp = 0; temp < sourceList.getLength(); temp++) {
			Node sourceNode = sourceList.item(temp);
			if (sourceNode.getNodeType() == Node.ELEMENT_NODE) {
				String elementName = sourceNode.getNodeName();
				if (isSimpleElement(sourceNode)) {
					items.addSimpleElement(elementName, sourceNode.getTextContent());
				} else {
					items.addSubElement(getItems(sourceNode));
				}
			}
		}
		items.setAttributes(getAttributesMap(source));
		return items;
	}

	private static boolean isSimpleElement(Node node) {
		return node.getChildNodes().getLength() == 1;
	}

	private static Map<String, String> getAttributesMap(Node node) {
		Map<String, String> attributes = new HashMap<>();
		if (node.hasAttributes()) {
			NamedNodeMap nodeMap = node.getAttributes();
			for (int i = 0; i < nodeMap.getLength(); i++) {
				Node sourceNodeAttr = nodeMap.item(i);
				String nodeName = sourceNodeAttr.getNodeName();
				if (nodeName.equalsIgnoreCase("id")) {
					continue;
				}
				attributes.put(nodeName, sourceNodeAttr.getNodeValue());
			}
		}
		return attributes;
	}
}
