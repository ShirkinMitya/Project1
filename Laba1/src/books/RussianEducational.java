package books;

public class RussianEducational extends Book {

    private String subType;

    public RussianEducational(String name, String subType) {
        super(name);
        this.subType = subType;
        this.setType(BookType.RUSSIAN_EDUCATIONAL);

    }

    @Override
    public String toString() {
        return "Russian Textbook - Name: " + getName() + ", Type: " + getType();
    }
}
