package books;

public class EnglishBookFactory implements AbstractBookFactory {

    @Override
    public EnglishEducational createEducationalBook() {
        return new EnglishEducational();
    }

    @Override
    public EnglishFiction createFictionBook() {
        return new EnglishFiction();
    }
}
