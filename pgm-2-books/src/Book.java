public class Book {
    String author, title, publisher;
    float price;
    private int cnt = 0;
    private int _id = 0;

    Book(String title, String author, String publisher, float price) {
        this._id = cnt++;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public String toString() {
        return "[ Title: " + title + ", author: " + author + ", publisher: " + publisher + ", price: " + price + " ]\n";
    }
}
