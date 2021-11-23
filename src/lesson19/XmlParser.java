package lesson19;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlParser {
    public static void main(String[] args) {
        File file = new File("src\\lesson19\\test.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document document = null;
        try {
             document = factory.newDocumentBuilder().parse(file);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        Node firstChild = document.getFirstChild();

        NodeList childNodes = firstChild.getChildNodes();
        System.out.println(firstChild.getNodeName());
        String nameFile = null;
        NodeList childNodesPeople = null;

        for(int i  =0  ;i<childNodes.getLength();i++){
            if(childNodes.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }

            switch (childNodes.item(i).getNodeName()){
                case "name": {
                    nameFile = childNodes.item(i).getTextContent();

                }
                case "people":{
                    childNodesPeople = childNodes.item(i).getChildNodes();
                }
            }
            if(childNodesPeople.item(i) == null){
                return;
            }

        }
        for(int i = 0; i < childNodesPeople.getLength();i++){
            if(childNodesPeople.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }


        }
    }
}
