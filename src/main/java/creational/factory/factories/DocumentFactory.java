package creational.factory.factories;

import creational.factory.models.Document;
import creational.factory.models.DocumentType;
import creational.factory.models.Excel;
import creational.factory.models.PDF;

public class DocumentFactory {
    public static Document createDocument(DocumentType type) {
        switch(type)
        {
            case PDF:
                return new PDF();
            case EXCEL:

                return new Excel();
            default:
                throw new IllegalArgumentException();
        }
    }
}
