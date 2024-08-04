package ezemgil.converters;

import com.groupdocs.conversion.Converter;
import com.groupdocs.conversion.options.convert.PdfConvertOptions;

import java.io.File;

public class XSLXtoPDF implements ConversionAlgorithm {
    @Override
    public File convert(File file) throws Exception {
        Converter converter = new Converter(file.getAbsolutePath());
        PdfConvertOptions options = new PdfConvertOptions();
        converter.convert(file.getAbsolutePath() + ".pdf", options);
        converter.close();
        return new File(file.getAbsolutePath() + ".pdf");
    }

}
