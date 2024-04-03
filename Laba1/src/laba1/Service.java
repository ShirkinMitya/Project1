package laba1;

import books.AbstractBookFactory;
import books.Book;
import books.EnglishEducationalBookFactory;
import books.EnglishFictionBookFactory;
import books.RussianEducationalBookFactory;
import books.RussianFictionBookFactory;
import customers.Builder;
import customers.Director;
import customers.LibraryClient;
import customers.LibraryClientType;
import customers.StudentBuilder;
import customers.TeacherBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

public class Service {

    private List<Book> books = new ArrayList<>();
    private List<LibraryClient> students = new ArrayList<>();
    private List<LibraryClient> teachers = new ArrayList<>();

    public void createBook() {
        createConcretBooks(new RussianEducationalBookFactory(), 20);
        createConcretBooks(new RussianFictionBookFactory(), 35);
        createConcretBooks(new EnglishEducationalBookFactory(), 30);
        createConcretBooks(new EnglishFictionBookFactory(), 15);
    }

    public void createConcretBooks(AbstractBookFactory factory, int amount) {
        for (int i = 0; i < amount; i++) {
            books.add(factory.createBook());
        }
    }

    public void createPeople() {
        students = createConcretPeople(new StudentBuilder(), 10);
        teachers = createConcretPeople(new TeacherBuilder(), 10);
        takeBook(students);
        takeBook(teachers);
    }

    public List<LibraryClient> createConcretPeople(Builder builder, int amount) {
        Random random = new Random();
        Director director = new Director(builder);
        List<LibraryClient> clients = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            LibraryClient libraryClient;
            if (random.nextInt(2) == 0) {
                libraryClient = director.createLibraryClient(LibraryClientType.MAN);
            } else {
                libraryClient = director.createLibraryClient(LibraryClientType.WOMAN);
            }
            clients.add(libraryClient);
        }
        return clients;
    }

    public int[] generateRandomNumbers() {
        Random random = new Random();
        int quantityOfBooks = (int) Math.round(Math.random() * 7 + 3);
        int[] randomNumbers = new int[quantityOfBooks];
        for (int i = 0; i < quantityOfBooks; i++) {
            randomNumbers[i] = random.nextInt(books.size());
        }
        return randomNumbers;
    }

    public void takeBook(List<LibraryClient> clients) {
        for (LibraryClient client : clients) {
            int[] indexes = generateRandomNumbers();
            for (int i = 0; i < indexes.length; i++) {
                client.getBooks().add(books.get(indexes[i]));
            }
        }
    }
    
    public void deliteData(){
        books.clear();
        students.clear();
        teachers.clear();
    }

    public DefaultMutableTreeNode addInfotoGUI() {
        DefaultMutableTreeNode mainNode = new DefaultMutableTreeNode("Клиенты");
        mainNode.add(getClientsNodes("Студенты", students));
        mainNode.add(getClientsNodes("Преподователи", teachers));
        return mainNode;
    }

    public MutableTreeNode getNode(LibraryClient libraryClient) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(libraryClient.getFullName());
        List<Book> clientBooks = libraryClient.getBooks();
        for (Book book : clientBooks) {
            DefaultMutableTreeNode nodeTwo = new DefaultMutableTreeNode(book.toString());
            nodeTwo.add(new DefaultMutableTreeNode(book.getType().getName()));
            node.add(nodeTwo);
        }
        return node;
    }

    public MutableTreeNode getClientsNodes(String nameOfNode, List<LibraryClient> clients) {
        DefaultMutableTreeNode clientnodes = new DefaultMutableTreeNode(nameOfNode);
        for (LibraryClient libraryClient : clients) {
            clientnodes.add(getNode(libraryClient));
        }
        return clientnodes;
    }
}
