import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

class priceComparator implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        if(b1.price == b2.price)
            return 0;
        if(b1.price > b2.price)
            return  1;
        return -1;
    }
}
public class BookArrayList {
    ArrayList<Book>bookAL = new ArrayList<>();

    void addNewBook(String title, String author, String publisher, float price) {
        Book b = new Book(title, author, publisher, price);

        bookAL.add(b);

        newLine();
    }

    ArrayList<Book> sortBookPerPrice() {
        ArrayList<Book> sortedBookList = new ArrayList<>();
        for(Book b : bookAL) {
            sortedBookList.add(b);
        }

        sortedBookList.sort(new priceComparator());
        return sortedBookList;
    }

    void printBooksByAuthor(String author) {
        for(Book b : bookAL) {
            if(Objects.equals(author, b.author)) {
                System.out.println(b);
            }
        }
        newLine();
    }

    void bookBelowPriceLimit(float maxPrice) {
        for(Book b : bookAL) {
            if(b.price <= maxPrice) {
                System.out.println(b);
            }
        }
        newLine();
    }

    void printBookDetailsWithMatchingTitleNames(String title) {
        for(Book b : bookAL) {
            if(b.title.contains(title)) {
                System.out.println(b);
            }
        }
        newLine();
    }

    void printBooksByPublisher(String publisher) {
        for(Book b : bookAL) {
            if(Objects.equals(b.publisher, publisher)) {
                System.out.println(b);
            }
        }
        newLine();
    }

    void updatePublisher(String title, String newPublisher) {
        for(Book b : bookAL) {
            if(Objects.equals(b.title, title)) {
                b.publisher = newPublisher;
                break;
            }
        }
        newLine();
    }

    private void newLine() {
        System.out.println();
    }
}