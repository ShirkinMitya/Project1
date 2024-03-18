package books;

public class EnglishFiction extends Book {

    public EnglishFiction(String name) {
        super(name);
    }

    @Override
    public String getInfo() {
        return "English Fiction - Name: " + getName();
    }
}
