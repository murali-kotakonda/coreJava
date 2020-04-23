package xmlPushpa;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlRemove {

	private static final String FILE_NAME = "myResult.log";

	static Logger logger = Logger.getLogger(XmlRemove.class.getName());

	private static final String OUTPUT_XML = "output.xml";
	private static final String INPUT_XML = "input.xml";
	private static final String CONF_ITEM = "CONF-ITEM";
	private static final String DSM = "dsm";
	private static final String SHORT_NAME = "SHORT-NAME";

	public static void main(String[] args) throws XPathExpressionException {
		int status = processRemoveNode(INPUT_XML,OUTPUT_XML,FILE_NAME);
		if(status==1) {
			System.out.println("FAILURE");
		}else {
			System.out.println("SUCCESS");
		}
	}

	private static int processRemoveNode(String inputXml,String outputXml,String logFileName) throws TransformerFactoryConfigurationError {
		System.setProperty("logfilename", logFileName);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Entering main method");
		File xmlfile = new File(inputXml);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		if (!xmlfile.exists()) {
			logger.info("*********** Xml file not found. Exiting program **************");
			return 1;
		}
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlfile);

			logger.info("xml parsing completed.");
			while (deleteElement(doc)) {

			}
			logger.info("deleting the CONF_ITEM completed.");
			doc.getDocumentElement().normalize();

			XPath xp = XPathFactory.newInstance().newXPath();
			NodeList nl = (NodeList) xp.evaluate("//text()[normalize-space(.)='']", doc, XPathConstants.NODESET);

			for (int i = 0; i < nl.getLength(); ++i) {
				Node node = nl.item(i);
				node.getParentNode().removeChild(node);
			}
			logger.info("Removed the blank/empty lines in the output xml.");

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(outputXml));
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(source, result);
			logger.info("writing to output xml file success.");
			return 0;
		} catch (Exception e1) {
			logger.info("Exception occured while removing the xml element.");
			e1.printStackTrace();
			return 1;
		}finally {
			logger.info("Exit main method");
		}
	}

	private static boolean deleteElement(Document doc) {
		logger.info("Entering deleteElement .");
		NodeList confitem = doc.getElementsByTagName(CONF_ITEM);
		// Fetch all elements with CONF_ITEM
		for (int i = 0; i < confitem.getLength(); i++) {
			Node node = confitem.item(i);
			if (node.getNodeType() == Document.ELEMENT_NODE) {
				Element confelement = (Element) node;
				NodeList nodeL = confelement.getElementsByTagName(SHORT_NAME);
				// fetch all element with SHORT_NAME
				for (int j = 0; j < nodeL.getLength(); j++) {
					Node node1 = nodeL.item(j);
					Node nodeToDel = node1.getParentNode();
					if (node1.getNodeType() == Document.ELEMENT_NODE && DSM.equalsIgnoreCase(node1.getTextContent())) {
						logger.info("SHORT_NAME with DSM found. Deleting the CONF_ITEM.");
						nodeToDel.getParentNode().removeChild(nodeToDel);
						return true;
					}
				}
			}
		}
		logger.info("Exiting deleteElement .");
		return false;
	}
}