package books;

public class EnglishEducational extends Book {

    private String level;
    private String author;
    private String university;

    public EnglishEducational(String name, String level, String author, String university) {
        super(name);
        this.level = level;
        this.author = author;
        this.university = university;
    }

    @Override
    public String getInfo() {
        return "English Textbook - Name: " + getName() + ", Level: " + level + ", Author: " + author + ", University: " + university;
    }

}
