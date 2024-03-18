package books;

public class RussianFiction extends Book {

    public RussianFiction(String name) {
        super(name);
    }

    @Override
    public String getInfo() {
        return "Russian Fiction - Name: " + getInfo();
    }
}
