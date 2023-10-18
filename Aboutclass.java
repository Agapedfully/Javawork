package objectandclass;
import java.util.Scanner;
class book{
	String title;
	String author;
	int numberOfPages;
}
public class Aboutclass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    //creating object
		book b=new book();
		//prompt user to enter book details
		System.out.println("Please enter the title of the book");
	    b.title=input.next();
	    System.out.println("Please enter the author of the book");
	    b.author=input.next();
	    System.out.println("Please enter the number of pages");
	    b.numberOfPages=input.nextInt();
	    
	    //Display the given information
	    System.out.println("The book title is: "+b.title );
	    System.out.println("The book author is: "+b.author );
	    System.out.println("The book has "+b.numberOfPages+" pages" );
	    
	    
	    
	

	}

}
