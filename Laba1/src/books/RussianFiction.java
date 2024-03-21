package books;

public class RussianFiction extends Book {

    public RussianFiction(String name) {
        super(name);
        this.setType(BookType.RUSSIAN_FICTION);
    }

    @Override
    public String toString() {
        return "Russian Fiction - Name: " + getName() + getType();
    }
}
