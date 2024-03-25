package books;

import java.util.List;
import java.util.Random;

public class RussianBookFactory implements AbstractBookFactory {

    public static List<String> namesForEducational;
    public static List<String> subType;
    public static List<String> namesForFiction;
    public static List<String> author;

    @Override
    public RussianEducational createEducationalBook() {
        Random random = new Random();
        int indexNamesForEducational = random.nextInt(namesForEducational.size());
        int indexSubType = random.nextInt(subType.size());
        return new RussianEducational(namesForEducational.get(indexNamesForEducational),
                subType.get(indexSubType));
    }

    @Override
    public RussianFiction createFictionBook() {
        Random random = new Random();
        int indexNamesForFiction = random.nextInt(namesForFiction.size());
        int indexAuthor = random.nextInt(author.size());
        return new RussianFiction(namesForFiction.get(indexNamesForFiction), author.get(indexAuthor));

    }

}
