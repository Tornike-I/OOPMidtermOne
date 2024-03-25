package week4;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Books {
    static Set<String> Books = new HashSet<>();
    static Set<String> libBooks = new HashSet<>();

    static void displayBooks() {
        for (String book : libBooks) {
            System.out.println(book);
        }

    }

    static void addBook() {
        Scanner in = new Scanner(System.in);
        System.out.print("Add a book: ");
        String book = in.nextLine();
        Books.add(book);
        libBooks.add(book);
        in.close();
    }

    static void checkOutBook() {
        Scanner in = new Scanner(System.in);
        System.out.print("Check out book: ");
        String book = in.nextLine();
        boolean isBook = libBooks.contains(book);
        if (isBook) {
            libBooks.remove(book);
        } else {
            System.out.println("No such book in our library");
        }
        in.close();
    }

    static void returnBook() {
        Scanner in = new Scanner(System.in);
        System.out.print("Check out book: ");
        String book = in.nextLine();
        boolean isBook = Books.contains(book);
        if (isBook) {
            libBooks.add(book);
        } else {
            System.out.println("This book is not from our library");
        }
        in.close();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to our library, you can press 0 to exit");
        System.out.println("Press 1 to view books in our library");
        System.out.println("Press 2 to check out book");
        System.out.println("Press 3 to return a book");
        System.out.println("Press 4 to add a book to the library");

        boolean app = true;
        while (app) {
            Scanner in = new Scanner(System.in);
            int command = in.nextInt();
            switch (command) {
                case 1:
                    displayBooks();
                    break;
                case 2:
                    checkOutBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    addBook();
                    break;
                case 0:
                    app = false;
            in.close();
            }
        }
    }
}
