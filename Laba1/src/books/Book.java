package books;

public abstract class Book {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public abstract String getInfo();
    
    public String getName(){
        return name;
    }

}
