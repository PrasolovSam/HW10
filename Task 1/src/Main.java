import java.util.Scanner;

public class Main {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            int costCount = inputCostCount();
            addBook(name);
            addBook(name, pageCount);
            addBook(name, pageCount, costCount);
            printInfo();
        }
    }

    private static int inputCostCount() {
        System.out.println("Введите цену книги:");
        return new Scanner(System.in).nextInt();
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0, 0);
    }

    public static void addBook(String bookName, int pageCount) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр.\n";
    }

    private static void addBook(String bookName, int pageCount, int costCount) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр. " +
                (costCount > 0 ? costCount + "руб." : "Цена не установлена\n");

    }
    public static void printInfo() {
        System.out.println(booksInfo);
    }

}
