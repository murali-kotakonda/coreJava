package xmlMurali;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

public class TestCompareXMLs {

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

class Items {
	Map<String, String> simpleElements = new HashMap<>();
	Map<String, String> attributes = new HashMap<>();
	List<Items> subElements = new ArrayList<>();

	@Override
	public String toString() {
		return "Items [simpleElements=" + simpleElements + ", attributes=" + attributes + ", subElements=" + subElements
				+ "]";
	}

	public void addSubElement(Items subElement) {
		subElements.add(subElement);
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public Map<String, String> getSimpleElements() {
		return simpleElements;
	}

	public void addSimpleElement(String elementName, String textContent) {
		simpleElements.put(elementName, textContent);
	}

	public void addAttributes(String elementName, String textContent) {
		attributes.put(elementName, textContent);
	}

	public void setSimpleElements(Map<String, String> simpleElements) {
		this.simpleElements = simpleElements;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attributes == null) ? 0 : attributes.hashCode());
		result = prime * result + ((simpleElements == null) ? 0 : simpleElements.hashCode());
		result = prime * result + ((subElements == null) ? 0 : subElements.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Items other = (Items) obj;

		if (!simpleElements.equals(other.simpleElements))
			return false;

		for (Items item : subElements) {
			if (!other.subElements.contains(item)) {
				return false;
			}
		}
		
		if (!attributes.equals(other.attributes))
			return false;
		
		return true;
	}
}
