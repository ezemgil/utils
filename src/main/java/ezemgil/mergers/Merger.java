package ezemgil.mergers;

import java.io.File;
import java.util.List;

public class Merger {
    private final MergerAlgorithm algorithm;
    private List<File> files;

    public Merger(MergerAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public File merge() throws Exception {
        return algorithm.merge(this.files);
    }
}
