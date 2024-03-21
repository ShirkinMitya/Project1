package customers;

import java.util.ArrayList;

public interface Builder {

    abstract Builder createFullName();
    
    public static ArrayList<String> ManNames = new ArrayList<>();
    public static ArrayList<String> WomanNames = new ArrayList<>();
    public static ArrayList<String> ManSurnames = new ArrayList<>();
    public static ArrayList<String> WomanSurnames = new ArrayList<>();
    public static ArrayList<String> TeachersManSurnames = new ArrayList<>();
    public static ArrayList<String> TeachersWomanSurnames = new ArrayList<>();
    public static ArrayList<String> TeachersManMiddleNames = new ArrayList<>();
    public static ArrayList<String> TeachersWomanMiddleNames = new ArrayList<>();

}
