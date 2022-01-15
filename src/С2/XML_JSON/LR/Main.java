package С2.XML_JSON.LR;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        try {

            File file = new File("C:/Users/4exan/IdeaProjects/test/src/С2/XML_JSON/LR/menu.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);

            Element root = doc.getDocumentElement();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
