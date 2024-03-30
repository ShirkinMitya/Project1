package customers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import laba1.CSVreader;

public class TeacherBuilder extends Builder {

    private String fullName;
    private List<String> TeachersManSurnames = new ArrayList<>();
    private List<String> TeachersWomanSurnames = new ArrayList<>();
    private List<String> TeachersManMiddleNames = new ArrayList<>();
    private List<String> TeachersWomanMiddleNames = new ArrayList<>();
    private String csvFileFIO = "/Users/shirkinmity/Desktop/Фио.csv";
    private CSVreader csvreader = new CSVreader();

    @Override
    public Builder createName(LibraryClientType type) {
        Random random = new Random();
        int indexName = random.nextInt(getNames(type).size());
        fullName += getNames(type).get(indexName) + " ";
        return this;
    }

    @Override
    public Builder createSurName(LibraryClientType type) {
        fullName = null;
        List<String> surnames;
        if (type == LibraryClientType.MAN) {
            surnames = TeachersManSurnames;
        } else {
            surnames = TeachersWomanSurnames;
        }
        Random random = new Random();
        int indexSurnames = random.nextInt(surnames.size());
        fullName = surnames.get(indexSurnames) + " ";
        return this;
    }

    @Override
    public Builder createSecondName(LibraryClientType type) {
        List<String> secondnames;
        if (type == LibraryClientType.MAN) {
            secondnames = TeachersManMiddleNames;
        } else {
            secondnames = TeachersWomanMiddleNames;
        }
        Random random = new Random();
        int indexSecondName = random.nextInt(secondnames.size());
        fullName += secondnames.get(indexSecondName);
        return this;
    }

    @Override
    public LibraryClient createLibraryClient() {
        return new LibraryClient(fullName);
    }

    @Override
    void readData() {
        csvreader.readCsvGeneralPeople(csvFileFIO, this);
        csvreader.readCsvTeachers(csvFileFIO, this);
    }

    @Override
    public void deliteData() {
        this.TeachersManMiddleNames.clear();
        this.TeachersWomanMiddleNames.clear();
        this.TeachersManSurnames.clear();
        this.TeachersWomanSurnames.clear();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<String> getTeachersManSurnames() {
        return TeachersManSurnames;
    }

    public void setTeachersManSurnames(List<String> TeachersManSurnames) {
        this.TeachersManSurnames = TeachersManSurnames;
    }

    public List<String> getTeachersWomanSurnames() {
        return TeachersWomanSurnames;
    }

    public void setTeachersWomanSurnames(List<String> TeachersWomanSurnames) {
        this.TeachersWomanSurnames = TeachersWomanSurnames;
    }

    public List<String> getTeachersManMiddleNames() {
        return TeachersManMiddleNames;
    }

    public void setTeachersManMiddleNames(List<String> TeachersManMiddleNames) {
        this.TeachersManMiddleNames = TeachersManMiddleNames;
    }

    public List<String> getTeachersWomanMiddleNames() {
        return TeachersWomanMiddleNames;
    }

    public void setTeachersWomanMiddleNames(List<String> TeachersWomanMiddleNames) {
        this.TeachersWomanMiddleNames = TeachersWomanMiddleNames;
    }

}
