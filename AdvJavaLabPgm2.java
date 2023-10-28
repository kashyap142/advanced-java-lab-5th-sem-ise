import java.util.*;
import java.util.Map.Entry;

class book{
	String title,author,publisher;
	double price;
	
	public book(String title,String author,String publisher,Double price) {
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
	}
	
	public String display() {
		return "Title: "+title+" Author: "+author+" Publisher: "+publisher+
				" Price: "+price;
	}
}

class priceComparator implements Comparator<book> { 
	  
    // override the compare() method 
    public int compare(book b1, book b2) 
    { 
        if (b1.price == b2.price) 
            return 0; 
        else if (b1.price > b2.price) 
            return 1; 
        else
            return -1; 
    } 
} 


public class AdvJavaLabPgm2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		HashMap<Integer,book> hm=new HashMap();
		
		book b1=new book("Harry Potter","J K Rowling","Bloomsbury Publishing",(double)799);
		
		book b2=new book("India that is Bharat","J Sai Deepak","Bloomsbury Publishing",(double)899);
		
		book b3=new book("The Immortals of Meluha","Amish Tripathi","Westland Press",(double)759);
	
		ArrayList<book> al=new ArrayList();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		
		//Ascending order of price and store it in a list
		Collections.sort(al,new priceComparator());
		for(int i=0;i<al.size();i++)
		System.out.println(al.get(i).display());
		
		//Maintain the book details with respect to a unique book id
		int id=1;
		for(book b:al) {hm.put(id++,b);}
		
		//Prompt for an author name and list all books by the author
		
		String authorSearch=sc.nextLine();
		
		for(int i: hm.keySet()) {
			if(hm.get(i).author.equals(authorSearch)) {
				System.out.println(hm.get(i).display());
			}
		}
		
		//Create a new list holding all the book details grater than a 
		//user specified price
		
		int userPrice=sc.nextInt();
		
		for(int i:hm.keySet()) {
			if(hm.get(i).price>userPrice) {
				System.out.println(hm.get(i).display());
				}
		}
		
		//For a given value by the user, find all books that match either
		//match the whole or a part of the title
		
		String search=sc.nextLine();
		
		for(int i : hm.keySet()) {
			
			if(hm.get(i).author.contains(search)) {
				System.out.println(hm.get(i).display());
			}
		}
		
		
		//Identify a publisher and print books from a particular publisher
		
		
		String searchUsingPublisher=sc.nextLine();
		
		for(int i : hm.keySet()) {
			
			if(hm.get(i).author.equals(searchUsingPublisher)) {
				System.out.println(hm.get(i).display());
			}
		}
		
		//Update the publisher details based on title
		
		String newPublisher=sc.nextLine();
		
		for(int i : hm.keySet()) {
			
			if(hm.get(i).author.equals(searchUsingPublisher)) {
				book toBeChanged=hm.get(i);
				toBeChanged.publisher=newPublisher;
				hm.put(i, toBeChanged);
			}
		}
		
		
		
	}

}
