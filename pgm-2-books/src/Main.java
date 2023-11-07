import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookArrayList BAL = new BookArrayList();

        System.out.print("Enter no. of books: ");
        int n = Integer.parseInt(sc.nextLine());
        String author, title, publisher;
        float price;
        for(int i=0; i<n; i++) {
            System.out.print("Enter book title: ");
            title = sc.nextLine();

            System.out.print("Enter author name: ");
            author = sc.nextLine();

            System.out.print("Enter publisher: ");
            publisher = sc.nextLine();

            System.out.print("Enter price of the book: ");
            price = Float.parseFloat(sc.nextLine());

            BAL.addNewBook(title, author, publisher, price);
        }

        System.out.println("Sorting book according to price: ");
        ArrayList<Book> sortedList = BAL.sortBookPerPrice();

        System.out.println(sortedList);

        System.out.println("Enter author name: ");
        author = sc.nextLine();

        System.out.println("Books by author: " + author + " are: ");
        BAL.printBooksByAuthor(author);

        System.out.print("Enter max price of books: ");
        price = Float.parseFloat(sc.nextLine());
        System.out.println("Books below price limit of " + price + " are:");
        BAL.bookBelowPriceLimit(price);

        System.out.print("Enter part title or part of title: ");
        title = sc.nextLine();

        System.out.println("Book details with matching title are: ");
        BAL.printBookDetailsWithMatchingTitleNames(title);

        System.out.print("Enter a publisher: ");
        publisher = sc.nextLine();

        System.out.println("Books published by publisher: " + publisher + " are: ");
        BAL.printBooksByPublisher(publisher);

        System.out.println("Enter title whose publisher to update: ");
        title = sc.nextLine();
        System.out.println("Enter new publisher name: ");
        String updatedPublisher = sc.nextLine();

        BAL.updatePublisher(title, updatedPublisher);
    }
}
