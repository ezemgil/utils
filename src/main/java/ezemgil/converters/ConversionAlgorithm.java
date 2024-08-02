package ezemgil.converters;

import java.io.File;

public interface ConversionAlgorithm {
    File convert(File file) throws Exception;
}
