package ezemgil;

import ezemgil.converters.Converter;
import ezemgil.converters.PPTXtoPDF;
import io.github.cdimascio.dotenv.Dotenv;

import java.io.File;

public class Main {
    private final static String EXT = ".pptx";
    private static Long startTime;
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        String filePath = dotenv.get("FILE_PATH");

        if (filePath == null) {
            System.err.println("Environment variable FILE_PATH is not set.");
            return;
        }

        Converter converter = new Converter(new PPTXtoPDF());
        converter.setFile(new File(filePath + "/sample" + EXT));
        try {
            startTime = System.currentTimeMillis();
            File pdfFile = converter.convert();
            System.out.println("PDF created at: " + pdfFile.getAbsolutePath());
            System.out.println("Time taken: " + (System.currentTimeMillis() - startTime) + "ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}