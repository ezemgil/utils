package ezemgil.mergers;

import org.apache.pdfbox.multipdf.PDFMergerUtility;

import java.io.File;
import java.util.List;

public class PDFMerger implements MergerAlgorithm {
    @Override
    public File merge(List<File> files) throws Exception {
        if (files == null || files.isEmpty()) {
            throw new IllegalArgumentException("File list is empty or null");
        }

        PDFMergerUtility pdfMerger = new PDFMergerUtility();
        for (File file : files) {
            pdfMerger.addSource(file);
        }

        File firstFile = files.get(0);
        String mergedFileName = firstFile.getName().replace(".pdf", "") + "_merged.pdf";
        File mergedFile = new File(firstFile.getParent(), mergedFileName);
        pdfMerger.setDestinationFileName(mergedFile.getAbsolutePath());

        return mergedFile;
    }
}