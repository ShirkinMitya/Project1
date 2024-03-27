package books;

public abstract class Book {

    private final String name;
    private BookType type;

    public Book(String name) {
        this.name = name;
        this.type = null;
    }

    public String getName() {
        return name;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public BookType getType() {
        return type;
    }
}
