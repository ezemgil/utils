package ezemgil.converters;

import java.io.File;

public class Converter {
    private final ConversionAlgorithm algorithm;
    private File file;

    public Converter(ConversionAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public File convert() throws Exception {
        return algorithm.convert(file);
    }
}