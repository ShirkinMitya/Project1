package books;

public class EnglishFiction extends Book {

    private final String author;
    private final String year;

    public EnglishFiction(String name, String author, String year) {
        super(name);
        this.author = author;
        this.year = year;
        this.setType(BookType.ENGLISH_FICTION);
    }

    @Override
    public String toString() {
        return "НАЗВАНИЕ: " + getName() + " АВТОР: " + author + " ГОД: " + year;
    }
}
