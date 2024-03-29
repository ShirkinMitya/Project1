package customers;

import java.util.ArrayList;
import java.util.List;

public abstract class Builder {

    private List<String> ManNames = new ArrayList<>();
    private List<String> WomanNames = new ArrayList<>();

    abstract Builder createName(LibraryClientType types);

    abstract Builder createSurName(LibraryClientType types);

    abstract Builder createSecondName(LibraryClientType types);

    abstract LibraryClient createLibraryClient();

    abstract void readData();

    abstract void deliteData();

    public List<String> getNames(LibraryClientType types) {
        if (types == LibraryClientType.MAN) {
            return ManNames;
        } else {
            return WomanNames;
        }
    }

    public void setManNames(List<String> ManNames) {
        this.ManNames = ManNames;
    }

    public void setWomanNames(List<String> WomanNames) {
        this.WomanNames = WomanNames;
    }

}
