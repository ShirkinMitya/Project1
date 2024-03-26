package books;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnglishBookFactory implements AbstractBookFactory {

    public static List<String> namesForEducational = new ArrayList<>();
    public static List<String> authorForEducational = new ArrayList<>();
    public static List<String> levels = new ArrayList<>();
    public static List<String> univercities = new ArrayList<>();
    public static List<String> namesForFiction = new ArrayList<>();
    public static List<String> authorToFiction = new ArrayList<>();
    public static List<String> year = new ArrayList<>();

    @Override
    public EnglishEducational createEducationalBook() {
        Random random = new Random();
        int indexNameForEducational = random.nextInt(namesForEducational.size());
        int indexAuthorForEducatoinal = random.nextInt(authorForEducational.size());
        int indexLevels = random.nextInt(levels.size());
        int indexUnivercity = random.nextInt(univercities.size());
        return new EnglishEducational(namesForEducational.get(indexNameForEducational),
                authorForEducational.get(indexAuthorForEducatoinal),
                levels.get(indexLevels),
                univercities.get(indexUnivercity));
    }

    @Override
    public EnglishFiction createFictionBook() {
        Random random = new Random();
        int indexNameForFiction = random.nextInt(namesForFiction.size());
        int indexAuthorForFuction = random.nextInt(authorToFiction.size());
        int indexYear = random.nextInt(year.size());
        return new EnglishFiction(namesForFiction.get(indexNameForFiction),
                authorToFiction.get(indexAuthorForFuction),
                year.get(indexYear));
    }
}
