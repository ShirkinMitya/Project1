package books;

public class RussianBookFactory implements AbstractBookFactory {

    @Override
    public RussianEducational createEducationalBook() {
        return new RussianEducational();
    }

    @Override
    public RussianFiction createFictionBook() {
        return new RussianFiction();
    }

}
