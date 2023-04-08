package knigi;

import knigi.model.Author;
import knigi.model.Binding;
import knigi.model.Book;
import knigi.model.Publisher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Book> newBooks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("Добавить книгу? ");
            String isAdd = scanner.nextLine().toLowerCase();

            if (!isAdd.equals("да")) break;

            newBooks.add(createBook());
        }

        Book[] books = newBooks.toArray(new Book[0]);

        System.out.println("Все наши книги : " + "[\n" + printBooks(books) + "]");

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

    private static Book createBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите идентификатор книги: ");
        String id = scanner.nextLine();
        System.out.print("Введите название книги: ");
        String name = scanner.nextLine();
        System.out.print("Введите автора: ");
        String authorName = scanner.nextLine();
        System.out.print("Введите издательство: ");
        String publisherName = scanner.nextLine();
        System.out.print("Введите год издательства(yyyy-mm-dd): ");
        String yearOfPublish = scanner.nextLine();
        System.out.print("Введите количество страниц: ");
        String pages = scanner.nextLine();
        System.out.print("Введите цену: ");
        String price = scanner.nextLine();
        System.out.print("Выберите переплет(Твердый/Мягкий): ");
        String binding = scanner.nextLine();

        return new Book(Integer.parseInt(id), name, new Author[]{new Author(authorName)},
                new Publisher(publisherName), LocalDate.parse(yearOfPublish),
                Integer.parseInt(pages), Double.parseDouble(price), Binding.getBindingFromString(binding));
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

        if (str.length() == 0) {
            return "Нет книг.";
        }
        return str.toString();
    }
}
