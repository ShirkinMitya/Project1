package books;

public class EnglishEducational extends Book {

    private final String level;
    private final String author;
    private final String university;

    public EnglishEducational(String name, String author, String university, String level) {
        super(name);
        this.author = author;
        this.level = level;
        this.university = university;
        this.setType(BookType.ENGLISH_EDUCATIONAL);
    }

    @Override
    public String toString() {
        return "НАЗВАНИЕ: " + getName() + " АВТОР: " + author + " УНИВЕРСИТЕТ: " + university + " УРОВЕНЬ: " + level;
    }

}
