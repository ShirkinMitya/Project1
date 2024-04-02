package books;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import laba1.CSVreader;

public class RussianFictionBookFactory implements AbstractBookFactory {

    private List<String> namesForFiction = new ArrayList<>();
    private List<String> author = new ArrayList<>();
    private CSVreader csvreader = new CSVreader();
    private String csvFileRussianFiction = "/Users/shirkinmity/Desktop/РусскаяХодожественная.csv";

    public RussianFictionBookFactory() {
        readData();
    }

    @Override
    public RussianFiction createBook() {
        Random random = new Random();
        int indexNamesForFiction = random.nextInt(namesForFiction.size());
        int indexAuthor = random.nextInt(author.size());
        return new RussianFiction(namesForFiction.get(indexNamesForFiction), author.get(indexAuthor));
    }

    private void readData() {
        csvreader.readCsvRussianFiction(csvFileRussianFiction, this);
    }

    public List<String> getNamesForFiction() {
        return namesForFiction;
    }

    public void setNamesForFiction(List<String> namesForFiction) {
        this.namesForFiction = namesForFiction;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

}
