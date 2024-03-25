package books;

public class EnglishFiction extends Book {

    private String author;
    private String year;

    public EnglishFiction(String name, String author, String year) {
        super(name);
        this.author = author;
        this.year = year;
        this.setType(BookType.ENGLISH_FICTION);
    }

    @Override
    public String toString() {
        return getName() + " " + author + " " + year;
    }
}
