package xmlBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class RunXMLBuilder {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        XMLBuilder xmlBuilder = new XMLBuilder();

        DocumentBuilderFactory menuFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder menuBuilder = menuFactory.newDocumentBuilder();
        Document menu = menuBuilder.newDocument();

        Element rootElement = menu.createElement("menu");
        menu.appendChild(rootElement);

        xmlBuilder.setSalads();
        xmlBuilder.setSoups();

        xmlBuilder.putSaladsIntoMenu(menu, rootElement);
        xmlBuilder.putSoupsIntoMenu(menu, rootElement);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(menu);
        StreamResult result = new StreamResult(new File("C:\\Users\\vkovatc\\menu.xml"));

        transformer.transform(source, result);
    }
}
