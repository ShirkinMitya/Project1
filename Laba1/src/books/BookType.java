package books;

public enum BookType {
    RUSSIAN_FICTION("Русская Художественная"),
    RUSSIAN_EDUCATIONAL("Русская Образовательная"),
    ENGLISH_FICTION("Английская Художественная"),
    ENGLISH_EDUCATIONAL("Английская Ообразовательная");
    private final String name;

    public String getName() {
        return name;
    }

    private BookType(String name) {
        this.name = name;
    }
}
