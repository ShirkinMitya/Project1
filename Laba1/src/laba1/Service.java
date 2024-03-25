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
import java.util.Random;
//import javax.swing.tree.DefaultMutableTreeNode;

public class Service {

    public static ArrayList<Book> books = new ArrayList<>();
    public static ArrayList<LibraryClient> students = new ArrayList<>();
    public static ArrayList<LibraryClient> teachers = new ArrayList<>();

    public void generateData() {
        Random random = new Random();
        AbstractBookFactory factory;
        Builder studentbuilder = new StudentBuilder();
        Builder teacherbuilder = new TeacherBuilder();
        Director studentdirector = new Director(studentbuilder);
        Director teacherdirector = new Director(teacherbuilder);

        for (int i = 0; i < 25; i++) {
            factory = new RussianBookFactory();
            books.add(factory.createFictionBook());
            books.add(factory.createEducationalBook());
            factory = new EnglishBookFactory();
            books.add(factory.createFictionBook());
            books.add(factory.createEducationalBook());
        }

        for (int i = 0; i < 20; i++) {
            LibraryClient libraryClient = random.nextInt(2) == 0 ? studentdirector.createManLibraryClient()
                    : studentdirector.createWomanLibraryClient();
            students.add(libraryClient);
        }

        for (int i = 0; i < 20; i++) {
            LibraryClient libraryClient = random.nextInt(2) == 0 ? teacherdirector.createManLibraryClient()
                    : teacherdirector.createWomanLibraryClient();
            teachers.add(libraryClient);
        }
    }

    public void takeBook() {

        for (LibraryClient student : students) {
            int quantityOfBooks = (int) Math.round(Math.random() * (10 - 3) + 3);
            for (int i = 1; i <= quantityOfBooks; i++) {
                int numberOfBook = (int) Math.round(Math.random() * (books.size() - 1));
                student.getBooks().add(books.get(numberOfBook));
                books.remove(numberOfBook);
            }
        }
        for (LibraryClient teacher : teachers) {
            int quantityOfBooks = (int) Math.round(Math.random() * (10 - 3) + 3);
            for (int i = 1; i <= quantityOfBooks; i++) {
                int numberOfBook = (int) Math.round(Math.random() * (books.size() - 1));
                teacher.getBooks().add(books.get(numberOfBook));
                books.remove(numberOfBook);
            }
        }
    }

    public void delete() {
        books = new ArrayList<>();
        teachers = new ArrayList<>();
        students = new ArrayList<>();
    }

    /*public DefaultMutableTreeNode addInfotoGUI() {
        DefaultMutableTreeNode main = new DefaultMutableTreeNode("Клиенты библиотеки");
        main.add(getSudentNodes());
        main.add(getTeachersNodes());
        return main;
    }

    public static MutableTreeNode getSudentNodes() {
        DefaultMutableTreeNode studentnodes = new DefaultMutableTreeNode("Студенты");
        for (LibraryClient libraryClient : students) {
            studentnodes.add(libraryClient.getNode());
        }
        return studentnodes;
    }

    public static MutableTreeNode getTeachersNodes() {
        DefaultMutableTreeNode teachernodes = new DefaultMutableTreeNode("Преподаватели");
        for (LibraryClient libraryClient : teachers) {
            teachernodes.add(libraryClient.getNode());
        }
        return teachernodes;
    }
*/

}
