package yaksha;

import java.util.Scanner;

public class MainClass {
	
	
	 public static void main(String[] args) {
		   
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter date in month date year format");

		   String dateString = sc.nextLine();
	       
		   if( DateValidator.validateParseDate(dateString)&& DateValidator.calculateAge(dateString) >=18 )
			   
			   	System.out.println("Valid Date");
		   else 
			   System.out.println("Invalid Date");

		
		   
	}

}
