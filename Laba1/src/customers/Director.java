package customers;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
        this.builder.readData();
    }

    public LibraryClient createLibraryClient(LibraryClientType type) {

        return builder.createSurName(type)
                .createName(type)
                .createSecondName(type)
                .createLibraryClient();
    }
}
