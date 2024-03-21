package books;

import java.util.List;
import java.util.Random;

public class RussianBookFactory implements AbstractBookFactory {

    protected static List<String> names;
    protected static List<String> subType;

    @Override
    public RussianEducational createEducationalBook() {
        Random random = new Random();
        int indexNames = random.nextInt(names.size());
        int indexSubType = random.nextInt(subType.size());
        return new RussianEducational(names.get(indexNames), subType.get(indexSubType));
    }

    @Override
    public RussianFiction createFictionBook() {
        Random random = new Random();
        int indexNames = random.nextInt(names.size());
        return new RussianFiction(names.get(indexNames));
       
    }

}
