package books;

public class RussianFiction extends Book {

    private String author;

    public RussianFiction(String name, String author) {
        super(name);
        this.author = author;
        this.setType(BookType.RUSSIAN_FICTION);
    }

    @Override
    public String toString() {
        return "НАЗВАНИЕ: " + getName() + " АВТОР: " + author;
    }
}
