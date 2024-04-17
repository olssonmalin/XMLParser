package org.softhouse;
import org.softhouse.javacc.FileParser;
import org.softhouse.javacc.ParseException;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException, ParseException, ParserConfigurationException, TransformerException {
        String fileName;
        String destFileName;
        if (args.length > 0) {
            fileName = args[0];
        } else {
            fileName = "text.txt";
        }
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(fileName);
        if (inputStream == null) {
            System.out.println("File not found: " + fileName);
            return;
        }

        FileParser parser = new FileParser(inputStream);
        Document document = parser.parse();

        if (args.length > 1) {
            destFileName = args[1];
            parser.printDocument(document, destFileName);
        } else {
            parser.printDocument(document, System.out);
        }
        parser.parse();
    }
}