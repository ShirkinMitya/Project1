package laba1;

import books.AbstractBookFactory;
import books.Book;
import books.EnglishBookFactory;
import books.RussianBookFactory;
import customers.Builder;
import customers.Director;
import customers.LibraryClient;
import customers.StudentBuilder;
import customers.TeacherBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

public class Service {

    public static List<Book> books = new ArrayList<>();
    public static List<LibraryClient> students = new ArrayList<>();
    public static List<LibraryClient> teachers = new ArrayList<>();

    public void createData() {
        Random random = new Random();
        AbstractBookFactory factory;
        Builder studentbuilder = new StudentBuilder();
        Builder teacherbuilder = new TeacherBuilder();
        Director studentdirector = new Director(studentbuilder);
        Director teacherdirector = new Director(teacherbuilder);

        factory = new RussianBookFactory();
        for (int i = 0; i < 20; i++) {
            books.add(factory.createEducationalBook());
        }
         for (int i = 0; i < 35; i++) {
            books.add(factory.createFictionBook());
        }
        factory = new EnglishBookFactory();
        for (int i = 0; i < 15; i++) {
            books.add(factory.createFictionBook());
        }
        for (int i = 0; i < 30; i++) {
            books.add(factory.createEducationalBook());
        }

        for (int i = 0; i < 10; i++) {
            LibraryClient libraryClient = random.nextInt(2) == 0 ? studentdirector.createManLibraryClient()
                    : studentdirector.createWomanLibraryClient();
            students.add(libraryClient);
        }

        for (int i = 0; i < 10; i++) {
            LibraryClient libraryClient = random.nextInt(2) == 0 ? teacherdirector.createManLibraryClient()
                    : teacherdirector.createWomanLibraryClient();
            teachers.add(libraryClient);
        }
        takeBook();
    }

    public void takeBook() {
        for (LibraryClient student : students) {
            List<Book> copyOfBooks = new ArrayList<>(books);
            int quantityOfBooks = (int) Math.round(Math.random() * 7 + 3);
            for (int i = 1; i <= quantityOfBooks; i++) {
                int numberOfBook = (int) Math.round(Math.random() * (copyOfBooks.size() - 1));
                student.getBooks().add(books.get(numberOfBook));
                copyOfBooks.remove(numberOfBook);
            }
        }
        for (LibraryClient teacher : teachers) {
            List<Book> copyOfBooks = new ArrayList<>(books);
            int quantityOfBooks = (int) Math.round(Math.random() * 7 + 3);
            for (int i = 1; i <= quantityOfBooks; i++) {
                int numberOfBook = (int) Math.round(Math.random() * (copyOfBooks.size() - 1));
                teacher.getBooks().add(books.get(numberOfBook));
                copyOfBooks.remove(numberOfBook);
            }
        }
    }

    public void delete() {
        books = new ArrayList<>();
        teachers = new ArrayList<>();
        students = new ArrayList<>();
    }

    public DefaultMutableTreeNode addInfotoGUI() {
        DefaultMutableTreeNode mainNode = new DefaultMutableTreeNode("Клиенты библиотеки");
        mainNode.add(getSudentNodes());
        mainNode.add(getTeachersNodes());
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

    public MutableTreeNode getSudentNodes() {
        DefaultMutableTreeNode studentnodes = new DefaultMutableTreeNode("Студенты");
        for (LibraryClient libraryClient : students) {
            studentnodes.add(getNode(libraryClient));
        }
        return studentnodes;
    }

    public MutableTreeNode getTeachersNodes() {
        DefaultMutableTreeNode teachernodes = new DefaultMutableTreeNode("Преподаватели");
        for (LibraryClient libraryClient : teachers) {
            teachernodes.add(getNode(libraryClient));
        }
        return teachernodes;
    }
}
