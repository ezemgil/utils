package ezemgil.converters;

import com.spire.presentation.FileFormat;
import com.spire.presentation.Presentation;

import java.io.File;

public class PPTXtoPDF implements ConversionAlgorithm {
    @Override
    public File convert(File file) throws Exception {
        long startedAt = System.currentTimeMillis();
        Presentation presentation = new Presentation();
        presentation.loadFromFile(file.getAbsolutePath());
        File pdfFile = new File(file.getParent() + "/" + file.getName().replace(".pptx", ".pdf"));
        presentation.saveToFile(pdfFile.getAbsolutePath(), FileFormat.PDF);
        System.out.println("PDF created at: " + pdfFile.getAbsolutePath());
        System.out.println("Conversion finished in: " + (System.currentTimeMillis() - startedAt) + "ms");
        return pdfFile;
    }
}
