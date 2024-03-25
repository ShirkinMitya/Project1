package customers;

import java.util.List;
import java.util.Random;

public class TeacherBuilder implements Builder {

    private String fullName;

    @Override
    public Builder createName(List<String> names) {
        Random random = new Random();
        int indexName = random.nextInt(names.size());
        fullName += names.get(indexName);
        return this;
    }

    @Override
    public Builder createSurName(List<String> surnames) {
        Random random = new Random();
        int indexSurnames = random.nextInt(surnames.size());
        fullName += surnames.get(indexSurnames);
        return this;
    }

    @Override
    public Builder createSecondName(List<String> secondnames) {
        Random random = new Random();
        int indexSecondName = random.nextInt(secondnames.size());
        fullName += secondnames.get(indexSecondName);
        return this;
    }

    @Override
    public LibraryClient createLibraryClient() {

        return new LibraryClient(fullName);

    }

}
