//package students;
//
//
//
//import knigi.model.Author;
//import knigi.model.Binding;
//import knigi.model.Book;
//import knigi.model.Publisher;
//import students.model.Student;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        List<Student> newStudent = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//
//        for (;;) {
//            System.out.println("Добавить студента? ");
//            String isAdd = scanner.nextLine().toLowerCase();
//
//            if (!isAdd.equals("да")) break;
//
//            newStudent.add(createStudent());
//        }
//
//        Student[] students = newStudent.toArray(new Student[0]);
//
//        System.out.println("Все наши студенты : " + "[\n" + printStudents(students) + "]");
//
//        for(;;) {
//            System.out.println("Введите 1, если хотите найти студента по факультету.");
//            System.out.println("Введите 2, если хотите найти студента по году.");
//            System.out.println("Введите 3, если хотите найти студента группы.");
//            System.out.println("Введите 0, если хотите завершить программу.");
//            String userChoice = scanner.nextLine();
//            switch (userChoice) {
//                case "1":
//                    System.out.print("Введите факультет: ");
//                    String faculty = scanner.nextLine();
//                    System.out.println(printStudent(findStudentsByFaculty(students, faculty)));
//                    break;
//                case "3":
//                    System.out.print("Введите группу: ");
//                    String group = scanner.nextLine();
//                    System.out.println(printStudents(findStudentsByGroup(students,group)));
//                    break;
//                case "2":
//                    System.out.print("Введите с какого года: ");
//                    String yearOfBirth = scanner.nextLine();
//                    System.out.println(printStudents(findStudentsSinceDate(students, Integer.parseInt(yearOfBirth))));
//                    break;
//                default:
//                    System.out.println("Завершение программы!");
//                    System.exit(0);
//            }
//        }
//    }
//
//    private static Student createStudent() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Имя ");
//        String name = scanner.nextLine();
//        System.out.print("Фамилия ");
//        String surname = scanner.nextLine();
//        System.out.print("Отчество");
//        String lastname = scanner.nextLine();
//        System.out.print("год рождения");
//        String yearOfbirth = scanner.nextLine();
//        System.out.print("Адресс");
//        String adress = scanner.nextLine();
//        System.out.print("телефон");
//        String number = scanner.nextLine();
//        System.out.print(" факультет ");
//        String faculty = scanner.nextLine();
//        System.out.print(" курс ");
//        String course = scanner.nextLine();
//        System.out.print(" группа ");
//        String group = scanner.nextLine();
//
//        return new Student(name, surname, lastname, String faculty, new String[]{new String(adress)},
//                 LocalDate.parse(yearOfbirth), String group,
//                Integer.parseInt(course), Integer.parseInt(number));
//    }
//
//    private static Student[] findStudentsByFaculty(Student[] students, String name) {
//        Student[] returnedStudents = new Student[students.length];
//        int returnedStudentIndex = 0;
//
//        for (Student student : students) {
//            Name[] students = student.getName();
//            for (Author author : authors) {
//                if (author.getName().equals(authorName)) {
//                    returnedBooks[returnedBookIndex++] = book;
//                }
//            }
//        }
//
//        return returnedBooks;
//    }
//
//    private static Book[] findBooksByPublisher(Book[] books, String publisherName) {
//        Book[] returnedBooks = new Book[books.length];
//        int returnedBookIndex = 0;
//
//        for (Book book : books) {
//            if (book.getPublisher().getName().equals(publisherName)) {
//                returnedBooks[returnedBookIndex++] = book;
//            }
//        }
//
//        return returnedBooks;
//    }
//
//    private static Book[] findBooksSinceDate(Book[] books, int year) {
//        Book[] returnedBooks = new Book[books.length];
//        int returnedBookIndex = 0;
//        LocalDate date = LocalDate.of(year, 1, 1);
//
//        for (Book book : books) {
//            if (book.getYearOfPublication().isAfter(date)) {
//                returnedBooks[returnedBookIndex++] = book;
//            }
//        }
//
//        return returnedBooks;
//    }
//
//    private static String printBooks(Book[] books) {
//        StringBuilder str = new StringBuilder();
//        for (Book book : books) {
//            if (book != null) {
//                str.append(book).append("\n");
//            }
//        }
//        return str.toString();
//    }
//}
//
