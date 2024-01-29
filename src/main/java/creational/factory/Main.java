package creational.factory;

import creational.factory.factories.DocumentFactory;
import creational.factory.models.DocumentType;
import creational.factory.models.Excel;
import creational.factory.models.PDF;

public class Main {
    public static void main(String[] args)
    {
        // PdfService pdfService = PdfFactory.getInstance();
        // DocumentService documentService = DocumentService.create(DocumentType.Excel);

        // filestream
        //Excel excel = new Excel();

        //PDF pdf = new PDF();

        Excel excel = (Excel) DocumentFactory.createDocument(DocumentType.EXCEL);

        PDF pdf = (PDF) DocumentFactory.createDocument(DocumentType.PDF);
    }
}
