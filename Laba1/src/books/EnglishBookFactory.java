package books;

import java.util.List;
import java.util.Random;

public class EnglishBookFactory implements AbstractBookFactory {

    protected static List<String> names;
    protected static List<String> author;
    protected static List<String> levels;
    protected static List<String> univercity;

    @Override

    public EnglishEducational createEducationalBook() {
        Random random = new Random();
        int indexName = random.nextInt(names.size());
        int indexAuthor = random.nextInt(author.size());
        int indexLevels = random.nextInt(levels.size());
        int indexUnivercity = random.nextInt(univercity.size());
        return new EnglishEducational(names.get(indexName), author.get(indexAuthor),
                levels.get(indexLevels), univercity.get(indexUnivercity));
    }

    @Override
    public EnglishFiction createFictionBook() {
        Random random = new Random();
        int indexName = random.nextInt(names.size());
        return new EnglishFiction(names.get(indexName));
    }
}
