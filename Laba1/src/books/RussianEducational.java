package books;

public class RussianEducational extends Book {

    private String type;

    public RussianEducational(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public String getInfo() {
        return "Russian Textbook - Name: " + getName() + ", Type: " + type;
    }
}
