package ezemgil.converters;

import com.groupdocs.conversion.Converter;
import com.groupdocs.conversion.options.convert.PdfConvertOptions;

import java.io.File;

public class DOCXtoPDF implements ConversionAlgorithm {
    @Override
    public File convert(File file) throws Exception {
        Converter converter = new Converter(file.getAbsolutePath());
        File pdfFile = new File(file.getParent() + "/" + file.getName().replace(".docx", ".pdf"));
        PdfConvertOptions options = new PdfConvertOptions();
        converter.convert(pdfFile.getAbsolutePath(), options);
        return pdfFile;
    }

}
