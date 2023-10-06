package choicecode;
import java.util.Scanner;
public class Ussdassaignment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int repeater=0;
		do {
		//display the options given
		System.out.println("1:Sh20(30 mins,3hrs)");
		System.out.println("2:Sh50(40Mins+50SMS,24hrs)");
		System.out.println("3:Okoa Easy Sh500 (500Mins,7days)");
		System.out.println("4:Okoa 500");
		System.out.println("5:Okoa 250");
		System.out.println("6:Okoa 100");
		System.out.println("7:Okoa 50");
		System.out.println("0:more");
		
		//prompt user to enter option
		System.out.println("Enter your option:");
		int option=input.nextInt();
		
		//use switch to define options
		switch(option) {
		case 1:
			System.out.println("Confirmed Sh20(30 mins,3hrs)");
			break;
		case 2:
			System.out.println("Confirmed Sh50(40Mins+50SMS,24hrs)");
			break;
		case 3:
			System.out.println("Confirmed Okoa Easy Sh500 (500Mins,7days)");
			break;
		case 4:
			System.out.println("Confirmed Okoa 500");
			break;
		case 5:
			System.out.println("Confirmed Okoa 250");
			break;
		case 6:
			System.out.println("Confirmed Okoa 100");
			break;
		case 7:
			System.out.println("Confirmed Okoa 50");
			break;
		case 0:
		    System.out.println("8:Okoa 20");
			System.out.println("9:Okoa 10");
			System.out.println("10:Okoa minutes");
			System.out.println("11:Check balance");
			System.out.println("0:Back");
			break;
		default:
			System.out.println("invalid choice");
		
			
		}
		//more options
		System.out.println("Enter your option:");
		int choice=input.nextInt();
		
		switch(choice) {
		case 8:
			System.out.println("Confirmed Okoa 20");
			break;
		case 9:
			System.out.println("Confirmed Okoa 10");
			break;
		case 10:
			System.out.println("Confirmed Okoa minutes");
			break;
		case 11:
			System.out.println("Balance");
			break;
		case 0:
			repeater++;
			break;
		default:
			System.out.println("invalid choice.");
			
			

	} 

		}while(repeater>=1);}}
 
