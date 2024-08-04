package lect01act;

import java.util.Scanner;

public class numbers {

	public static void main(String[] args) {
		
		// get inputs
		
		System.out.println("enter the number 1:");

		Scanner sc = new Scanner (System.in);
		int num1=sc.nextInt();
		
		System.out.println("enter the number 2:");
		int num2=sc.nextInt();
		 
		System.out.println("enter the number 3:");
		
		int num3=sc.nextInt();
		
		int maximum = num1;
		int minimum =num1;
		
		
		// checking the largest one 
		
		 if (num2>maximum)
		 {
			 maximum = num2;
			 
		 }
		 else {
			 // check minimum
	        if (num2< minimum) 
	        	 minimum =num2;
	        	 
	        }
		 // checking third number 
		 
		 if (num3 >maximum)
		 {
			 maximum= num3;
			 
		 }
		 else {
			 if (num3< minimum)
			 
				 minimum= num3;
			 }
		 
		 System.out.println("maximum one of three numbers is :"+maximum);
		 System.out.println("minimum one of three numbers is :"+minimum);
		 
		 
	}

}
