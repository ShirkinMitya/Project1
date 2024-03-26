package books;

public enum BookType {
    RUSSIAN_FICTION("РХ"),
    RUSSIAN_EDUCATIONAL("РО"),
    ENGLISH_FICTION("АХ"),
    ENGLISH_EDUCATIONAL("АО");
    private final String name;

    public String getName() {
        return name;
    }

    private BookType(String name) {
        this.name = name;
    }
}
