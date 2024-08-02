package ezemgil.mergers;

import java.io.File;
import java.util.List;

public interface MergerAlgorithm {
    File merge(List<File> files) throws Exception;
}
