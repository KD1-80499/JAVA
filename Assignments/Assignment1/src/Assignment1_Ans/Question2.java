package Assignment1_Ans;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
	  Scanner Sc=new Scanner(System.in);
	  
	  System.out.println("Enter 1st numbers");
     if(Sc.hasNextDouble()!=Sc.hasNextInt())
     { 	 
    	 double num1=Sc.nextDouble();    	 
     System.out.println("Enter 2nd number"); 	  
    	 if(Sc.hasNextDouble()!=Sc.hasNextInt())
    	 {
    		 double num2=Sc.nextDouble();		 
    		 double avg=(num1+num2)/2;
    		 System.out.println("avg="+avg);
    	 } 	 
    	 else
    	 {
    		 System.out.println("Not a double number");
    	 }  	
     }
     else
     {	 
     System.out.println("Invalid");
     }
      
     Sc.close();
     }
 
   
}

