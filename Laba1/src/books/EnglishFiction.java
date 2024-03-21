package books;

public class EnglishFiction extends Book {

    public EnglishFiction(String name) {
        super(name);
        this.setType(BookType.ENGLISH_FICTION);
    }

    @Override
    public String toString() {
        return "English Fiction - Name: " + getName();
    }
}
