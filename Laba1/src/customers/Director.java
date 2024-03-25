package customers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Director {

    private Builder builder;
    public static List<String> ManNames = new ArrayList<>();
    public static List<String> WomanNames = new ArrayList<>();
    public static List<String> ManSurnames = new ArrayList<>();
    public static List<String> WomanSurnames = new ArrayList<>();
    public static List<String> TeachersManSurnames = new ArrayList<>();
    public static List<String> TeachersWomanSurnames = new ArrayList<>();
    public static List<String> TeachersManMiddleNames = new ArrayList<>();
    public static List<String> TeachersWomanMiddleNames = new ArrayList<>();

    public Director(Builder builder) {
        this.builder = builder;
    }

    public LibraryClient createManLibraryClient() {
        Random random = new Random();
        List<String> surnames = random.nextInt(2) == 0 ? TeachersManSurnames : ManSurnames;
        return builder.createSurName(surnames)
                .createName(ManNames)
                .createSecondName(TeachersManMiddleNames)
                .createLibraryClient();
    }

    public LibraryClient createWomanLibraryClient() {
        Random random = new Random();
        List<String> surnames = random.nextInt(2) == 0 ? TeachersWomanSurnames : WomanSurnames;
        return builder.createSurName(surnames)
                .createName(WomanNames)
                .createSecondName(TeachersWomanMiddleNames)
                .createLibraryClient();

    }

}
