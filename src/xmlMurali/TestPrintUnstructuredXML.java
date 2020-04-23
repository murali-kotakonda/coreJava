package xmlMurali;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class TestPrintUnstructuredXML {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		Document sourceXML = getDocumentinstance("employeeAddr.xml");
		Document targetXML = getDocumentinstance("employeeAddr.xml");
		
		Element root = sourceXML.getDocumentElement();
		System.out.println(root.getNodeName());
		NodeList childNodes = root.getChildNodes();
		travesrseAllNodes(childNodes);
	}

	private static Document getDocumentinstance(String xml) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File(xml));
		document.getDocumentElement().normalize();
		return document;
	}

	private static void travesrseAllNodes(NodeList nList) {
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node node = nList.item(temp);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				printAttributes(node);

				String elementName = node.getNodeName();

				if (isComplexElement(node)) {
					System.out.println(" Node Name = " + elementName + "; Value = " + node.getTextContent());
				}

				if (node.hasChildNodes()) {
					travesrseAllNodes(node.getChildNodes());
				}
			}
		}
	}

	private static boolean isComplexElement(Node node) {
		return node.getChildNodes().getLength() == 1;
	}

	private static void printAttributes(Node node) {
		if (node.hasAttributes()) {
			NamedNodeMap nodeMap = node.getAttributes();
			for (int i = 0; i < nodeMap.getLength(); i++) {
				Node tempNode = nodeMap.item(i);
				String nodeName = tempNode.getNodeName();
				if (!nodeName.equalsIgnoreCase("id"))
					System.out.println("Attr name : " + nodeName + "; Value = " + tempNode.getNodeValue());
			}
		}
	}
}
