package books;

public class RussianEducational extends Book {

    private final String subType;

    public RussianEducational(String name, String subType) {
        super(name);
        this.subType = subType;
        this.setType(BookType.RUSSIAN_EDUCATIONAL);
    }

    @Override
    public String toString() {
        return "НАЗВАНИЕ: " + getName() + " ТИП: " + subType;
    }
}
