package customers;

import java.util.List;
import java.util.Random;

public class StudentBuilder implements Builder {

    private String fullName;

    @Override
    public Builder createName(List<String> names) {
        Random random = new Random();
        int indexName = random.nextInt(names.size());
        fullName += names.get(indexName);
        return this; //вернёт стюдентбилдера на котором вызывается этот метод
    }

    @Override
    public Builder createSurName(List<String> surnames) {
        fullName = null;
        Random random = new Random();
        int indexSurnames = random.nextInt(surnames.size());
        fullName = surnames.get(indexSurnames) + " ";
        return this;
    }

    @Override
    public Builder createSecondName(List<String> secondnames) {
        return this;
    }

    @Override
    public LibraryClient createLibraryClient() {
        return new LibraryClient(fullName);
    }

}
