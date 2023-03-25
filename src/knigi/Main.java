package knigi;

import knigi.model.Author;
import knigi.model.Binding;
import knigi.model.Book;
import knigi.model.Publisher;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Publisher vstu = new Publisher("VSTU");
        Publisher iou = new Publisher("IOU");

        Author karisha009 = new Author("Karisha009");
        Author dimaKing = new Author("Dima King");

        Book genshinImpact = new Book("Genshin Impact", new Author[]{karisha009},
                vstu, LocalDate.of(2018, Month.MARCH, 10),
                300, 399.99, Binding.SOFTCOVER);
        Book kingOfNorth = new Book("King of North", new Author[]{dimaKing},
                iou, LocalDate.of(2000, Month.JUNE, 5),
                1000, 999.99, Binding.HARDCOVER);
        Book miAndMu = new Book("Mi and Mu", new Author[]{dimaKing, karisha009},
                vstu, LocalDate.of(2022, Month.DECEMBER, 15),
                500, 59.99, Binding.HARDCOVER);

        Book[] books = new Book[]{genshinImpact, kingOfNorth, miAndMu};

        System.out.println("Все наши книги : " + "[\n" + printBooks(books) + "]");

        Scanner scanner = new Scanner(System.in);
        for(;;) {
            System.out.println("Введите 1, если хотите найти книги по автору.");
            System.out.println("Введите 2, если хотите найти книги по издательству.");
            System.out.println("Введите 3, если хотите найти книги после заданного года.");
            System.out.println("Введите 0, если хотите завершить программу.");
            String userChoice = scanner.nextLine();
            switch (userChoice) {
                case "1":
                    System.out.print("Введите имя автора: ");
                    String authorName = scanner.nextLine();
                    System.out.println(printBooks(findBooksByAuthor(books, authorName)));
                    break;
                case "2":
                    System.out.print("Введите имя издательства: ");
                    String publisherName = scanner.nextLine();
                    System.out.println(printBooks(findBooksByPublisher(books, publisherName)));
                    break;
                case "3":
                    System.out.print("Введите с какого года книги искать: ");
                    String year = scanner.nextLine();
                    System.out.println(printBooks(findBooksSinceDate(books, Integer.parseInt(year))));
                    break;
                default:
                    System.out.println("Завершение программы!");
                    System.exit(0);
            }
        }
    }

    private static Book[] findBooksByAuthor(Book[] books, String authorName) {
        Book[] returnedBooks = new Book[books.length];
        int returnedBookIndex = 0;

        for (Book book : books) {
            Author[] authors = book.getAuthors();
            for (Author author : authors) {
                if (author.getName().equals(authorName)) {
                    returnedBooks[returnedBookIndex++] = book;
                }
            }
        }

        return returnedBooks;
    }

    private static Book[] findBooksByPublisher(Book[] books, String publisherName) {
        Book[] returnedBooks = new Book[books.length];
        int returnedBookIndex = 0;

        for (Book book : books) {
            if (book.getPublisher().getName().equals(publisherName)) {
                returnedBooks[returnedBookIndex++] = book;
            }
        }

        return returnedBooks;
    }

    private static Book[] findBooksSinceDate(Book[] books, int year) {
        Book[] returnedBooks = new Book[books.length];
        int returnedBookIndex = 0;
        LocalDate date = LocalDate.of(year, 1, 1);

        for (Book book : books) {
            if (book.getYearOfPublication().isAfter(date)) {
                returnedBooks[returnedBookIndex++] = book;
            }
        }

        return returnedBooks;
    }

    private static String printBooks(Book[] books) {
        StringBuilder str = new StringBuilder();
        for (Book book : books) {
            if (book != null) {
                str.append(book).append("\n");
            }
        }
        return str.toString();
    }
}
