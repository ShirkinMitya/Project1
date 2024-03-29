package books;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import laba1.CSVreader;

public class EnglishEducationalBookFactory implements AbstractBookFactory{

    private List<String> namesForEducational = new ArrayList<>();
    private List<String> authorForEducational = new ArrayList<>();
    private List<String> levels = new ArrayList<>();
    private List<String> univercities = new ArrayList<>();
    private final CSVreader csvreader = new CSVreader();
    private final String csvFileEnglisgEducational = "/Users/shirkinmity/Desktop/АнглийскаяНаучная.csv";

    public EnglishEducationalBookFactory() {
        readData();
    }

    @Override
    public EnglishEducational createBook() {
        Random random = new Random();
        int indexNameForEducational = random.nextInt(namesForEducational.size());
        int indexAuthorForEducatoinal = random.nextInt(authorForEducational.size());
        int indexLevels = random.nextInt(levels.size());
        int indexUnivercity = random.nextInt(univercities.size());
        return new EnglishEducational(namesForEducational.get(indexNameForEducational),
                authorForEducational.get(indexAuthorForEducatoinal),
                univercities.get(indexUnivercity),
                levels.get(indexLevels));
    }

    private void readData() {
        csvreader.readCsvEnglishEducational(csvFileEnglisgEducational, this);            
    }

    @Override
    public void deliteData() {
        this.namesForEducational.clear();
        this.authorForEducational.clear();
        this.levels.clear();
        this.univercities.clear();
    }

    public List<String> getNamesForEducational() {
        return namesForEducational;
    }

    public void setNamesForEducational(List<String> namesForEducational) {
        this.namesForEducational = namesForEducational;
    }

    public List<String> getAuthorForEducational() {
        return authorForEducational;
    }

    public void setAuthorForEducational(List<String> authorForEducational) {
        this.authorForEducational = authorForEducational;
    }

    public List<String> getLevels() {
        return levels;
    }

    public void setLevels(List<String> levels) {
        this.levels = levels;
    }

    public List<String> getUnivercities() {
        return univercities;
    }

    public void setUnivercities(List<String> univercities) {
        this.univercities = univercities;
    }
    

}
