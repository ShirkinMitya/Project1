package books;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import laba1.CSVreader;

public class RussianEducationalBookFactory implements AbstractBookFactory {

    private List<String> namesForEducational = new ArrayList<>();
    private List<String> subType = new ArrayList<>();
    private final CSVreader csvreader = new CSVreader();
    private final String csvFileRussianEducational = "/Users/shirkinmity/Desktop/РусскаяНаучная.csv";

    public RussianEducationalBookFactory() {
        readData();
    }

    @Override
    public RussianEducational createBook() {
        Random random = new Random();
        int indexNamesForEducational = random.nextInt(namesForEducational.size());
        int indexSubType = random.nextInt(subType.size());
        return new RussianEducational(namesForEducational.get(indexNamesForEducational),
                subType.get(indexSubType));
    }

    private void readData() {
        csvreader.readCsvRussianEducational(csvFileRussianEducational, this);
    }

    @Override
    public void deliteData() {
        this.namesForEducational.clear();
        this.subType.clear();
    }

    public List<String> getNamesForEducational() {
        return namesForEducational;
    }

    public void setNamesForEducational(List<String> namesForEducational) {
        this.namesForEducational = namesForEducational;
    }

    public List<String> getSubType() {
        return subType;
    }

    public void setSubType(List<String> subType) {
        this.subType = subType;
    }
    
}
