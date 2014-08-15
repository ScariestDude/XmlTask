package xmlReader;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLReader {
    protected String getValue(String tag, Element element) {
        NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodes.item(0);
        return node.getNodeValue();
    }

    protected boolean printSoups(Document menu) {
        NodeList soupNodeList = menu.getElementsByTagName("soup");
        System.out.println("\nDish category : " + menu.getElementsByTagName("soups").item(0).getNodeName());

        for (int i = 0; i < soupNodeList.getLength(); i++) {
            Node soupNode = soupNodeList.item(i);

            if (soupNode.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) soupNode;
                System.out.println("Title : " + getValue("title", element));
                System.out.println("Price : " + getValue("price", element));
            }
        }
        return true;
    }

    protected boolean printSalads(Document menu) {
        NodeList saladNodeList = menu.getElementsByTagName("salad");
        System.out.println("\nDish category : " + menu.getElementsByTagName("salads").item(0).getNodeName());

        for (int i = 0; i < saladNodeList.getLength(); i++) {
            Node saladNode = saladNodeList.item(i);

            if (saladNode.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) saladNode;
                System.out.println("Title : " + getValue("title", element));
                System.out.println("Price : " + getValue("price", element));
            }
        }
        return true;
    }
}

