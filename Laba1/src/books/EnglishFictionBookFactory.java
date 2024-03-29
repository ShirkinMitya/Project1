package books;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import laba1.CSVreader;

public class EnglishFictionBookFactory implements AbstractBookFactory {

    private List<String> namesForFiction = new ArrayList<>();
    private List<String> authorToFiction = new ArrayList<>();
    private List<String> year = new ArrayList<>();
    private final CSVreader csvreader = new CSVreader();
    private final String csvFileEnglishFiction = "/Users/shirkinmity/Desktop/АнглийскаяХудожественная.csv";

    public EnglishFictionBookFactory() {
        readData();
    }

    @Override
    public EnglishFiction createBook() {
        Random random = new Random();
        int indexNameForFiction = random.nextInt(namesForFiction.size());
        int indexAuthorForFuction = random.nextInt(authorToFiction.size());
        int indexYear = random.nextInt(year.size());
        return new EnglishFiction(namesForFiction.get(indexNameForFiction),
                authorToFiction.get(indexAuthorForFuction),
                year.get(indexYear));
    }

    private void readData() {
        csvreader.readCsvEnglishFuntion(csvFileEnglishFiction, this);
    }

    @Override
    public void deliteData() {
        this.namesForFiction.clear();
        this.authorToFiction.clear();
        this.year.clear();
    }

    public List<String> getNamesForFiction() {
        return namesForFiction;
    }

    public void setNamesForFiction(List<String> namesForFiction) {
        this.namesForFiction = namesForFiction;
    }

    public List<String> getAuthorToFiction() {
        return authorToFiction;
    }

    public void setAuthorToFiction(List<String> authorToFiction) {
        this.authorToFiction = authorToFiction;
    }

    public List<String> getYear() {
        return year;
    }

    public void setYear(List<String> year) {
        this.year = year;
    }

}
