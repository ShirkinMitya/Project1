package customers;

import java.util.List;

public interface Builder {

    abstract Builder createName(List<String> names);

    abstract Builder createSurName(List<String> surnames);

    abstract Builder createSecondName(List<String> secondnames);

    abstract LibraryClient createLibraryClient();
}
