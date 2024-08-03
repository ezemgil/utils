package ezemgil;

import ezemgil.converters.Converter;
import ezemgil.converters.DOCXtoPDF;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter(new DOCXtoPDF());
        converter.setFile(new File("C:/Users/ezemg/Desktop/Resumen parcial 3.docx"));
        try {
            File pdfFile = converter.convert();
            System.out.println("PDF created at: " + pdfFile.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}