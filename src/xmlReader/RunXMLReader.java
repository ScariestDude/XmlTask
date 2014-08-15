package xmlReader;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class RunXMLReader {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        XMLReader xmlReader = new XMLReader();

        File menuFile = new File("C:\\Users\\vkovatc\\menu.xml");
        DocumentBuilderFactory menuFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder menuBuilder = menuFactory.newDocumentBuilder();
        Document menu = menuBuilder.parse(menuFile);
        menu.getDocumentElement().normalize();

        System.out.println("Root element : " + menu.getDocumentElement().getNodeName());
        System.out.println("===============================");

        xmlReader.printSalads(menu);
        xmlReader.printSoups(menu);
    }
}