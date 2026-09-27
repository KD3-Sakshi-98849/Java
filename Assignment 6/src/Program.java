import java.util.*;
import java.util.List;
class Book{
	String isbn;
	double price;
	String authorName;
	int quantity;
	
	public Book() {
		
	}
	public Book(String isbn,
   double price,
	String authorName,
	int quantity) {
		this.isbn=isbn;
		this.price=price;
		this.authorName=authorName;
		this.quantity=quantity;
		
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "[isbn="+isbn+",price="+price+",authorName="+authorName+",quantity="+quantity+"]";
	}
}
public class Program {
	
	public static Scanner sc=new Scanner(System.in);
	public static List<Book> bookList=new ArrayList<>();
	
	public static Book[] getInstances() {
		Book [] arr=new Book[3];
		arr[0]= new Book("ab1",2000.0,"sakshi",1);
		arr[1]=new Book("sb1",2100.0,"sanika",2);
		arr[2]=new Book("ak01",3000.0,"Sahli",3);
		
		return arr;
	}
	public static void AddBook(Book []arr) {
	
		for(Book a:arr) {
			bookList.add(a);
		}
	}
	public static void Forwardorder() {
		for(Book b:bookList) {
			System.out.println(b);
		}
	}
	public static void Reverseorder() {
		for(int i=bookList.size()-1;i>=0;i--) {
			System.out.println(bookList.get(i));
		}
		
	}
	public static boolean DeleteBook(int index) {
		if(index>=0 && index<bookList.size()) {
			bookList.remove(index);
			return true;
		}
		return false;
		
	}
	public static void sortbyPrice() {
		bookList.sort((b1,b2)->
		Double.compare(b2.getPrice(), b1.getPrice()));
	}
	public static int menulist() {
		
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Display all books in reverse order");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Sort all books by price in desc order -- list.sort();");
		System.out.println("Enter choice:");
		return sc.nextInt();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		while((choice=menulist())!=0) {
			switch(choice) {
			
			case 1:
				Book [] arr=Program.getInstances();
				Program.AddBook(arr);
//				Program.AddBook(arr);
				System.out.println("Enter Book");
				String isbn=sc.next();
				double price=sc.nextDouble();
				String authorName=sc.next();
				int quantity=sc.nextInt();
//				Program.AddBook(arr);
				Book b=new Book(isbn,price,authorName,quantity);
				bookList.add(b);
				System.out.println("Added");
				break;
			
			case 2:
				Program.Forwardorder();
				
				break;
			
			case 3:
				Program.Reverseorder();
	
				break;
			case 4:
				System.out.println("Enter index");
				int index=sc.nextInt();
				if(Program.DeleteBook(index))
					System.out.println("Book deleted succesfullt:");
				else
					System.out.println("Invalid index");
				
				break;
			case 5:
				Program.sortbyPrice();

                System.out.println("Books sorted by price in descending order.");
                Program.Forwardorder();
				break;
			default:
				System.out.println("Invalid choice:");
			}
		}

	}

}
