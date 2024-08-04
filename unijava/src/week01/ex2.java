package week01;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		
		
       
        int total=0;
        float avg=0;
        
        
        
       while(true)
       { 
    	   System.out.println("enter the numbers :");
           Scanner sc=new Scanner (System.in);
           int num=sc.nextInt();
         
         if (num <0 ) {
        	 
        	 break;
        	 
         }
         
         total += num;
         
         avg = total/num;
    	  
    	   
       }
       
       System.out.println("total of numbers are "+ total);
       System.out.println("average of numbers are "+avg);
       
       
	}

}
