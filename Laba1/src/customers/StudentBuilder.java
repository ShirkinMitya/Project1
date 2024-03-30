package customers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import laba1.CSVreader;

public class StudentBuilder extends Builder {

    private String fullName;
    private List<String> ManSurnames = new ArrayList<>();
    private List<String> WomanSurnames = new ArrayList<>();
    private String csvFileFIO = "/Users/shirkinmity/Desktop/Фио.csv";
    private CSVreader csvreader = new CSVreader();

    @Override
    public Builder createName(LibraryClientType type) {
        Random random = new Random();
        int indexName = random.nextInt(getNames(type).size());
        fullName += getNames(type).get(indexName);
        return this;
    }

    @Override
    public Builder createSurName(LibraryClientType type) {
        fullName = null;
        List<String> surnames;
        if (type == LibraryClientType.MAN) {
            surnames = ManSurnames;
        } else {
            surnames = WomanSurnames;
        }
        Random random = new Random();
        int indexSurnames = random.nextInt(surnames.size());
        fullName = surnames.get(indexSurnames) + " ";
        return this;
    }

    @Override
    public Builder createSecondName(LibraryClientType type) {
        return this;
    }

    @Override
    public LibraryClient createLibraryClient() {
        return new LibraryClient(fullName);
    }

    @Override
    public void readData() {
        csvreader.readCsvGeneralPeople(csvFileFIO, this);
        csvreader.readCsvStudents(csvFileFIO, this);
    }

    @Override
    public void deliteData() {
        this.ManSurnames.clear();
        this.WomanSurnames.clear();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<String> getManSurnames() {
        return ManSurnames;
    }

    public void setManSurnames(List<String> ManSurnames) {
        this.ManSurnames = ManSurnames;
    }

    public List<String> getWomanSurnames() {
        return WomanSurnames;
    }

    public void setWomanSurnames(List<String> WomanSurnames) {
        this.WomanSurnames = WomanSurnames;
    }

}
