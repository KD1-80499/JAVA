package Assignment1_Ans;

import java.util.Scanner;

public class Question3 {

	// public static
	public static void main(String[] args) {
		int choice,qty,price;
		int totalbill;
		int total1=0,total2=0,total3=0,total4=0,total5=0,total6=0,total7=0,total8=0,total9=0;
		Scanner Sc=new Scanner(System.in);
		do {
		System.out.println("0.Exit");
		System.out.println("1.Dosa Rs.30");
		System.out.println("2.Samosa Rs.20");
		System.out.println("3.Idli Rs.20");
		System.out.println("4.kachori Rs.15");
		System.out.println("5.Dhokla Rs.15");
		System.out.println("6.Chole Bhature Rs.40");
		System.out.println("7.Sandhwich Rs.40");
		System.out.println("8.Vada Pav Rs.10");
		System.out.println("9.Pav Bhaji Rs.50");
		System.out.println("10.Generate Bill");
		choice=Sc.nextInt();
		
		//int total1=0,total2=0,total3=0,total4=0,total5=0,total6=0,total7=0,total8=0,total9=0;
		
		
			
		
		switch(choice)
		{
		case 0: System.out.println("Thank You for choosing");
		        break;
		        
		case 1:
			    System.out.println("Enter Quantity : ");
			    int qty1=Sc.nextInt();
			    total1=qty1*30;
			    
                break;        
		
		case 2: System.out.println("Enter Quantity : ");
					int qty2=Sc.nextInt();
					 total2=total1+qty2*20;
                break;        
		        
		case 3: System.out.println("Enter Quantity : ");
				int qty3=Sc.nextInt();
				 total3=total2+qty3*20;
                break;	
			
		case 4: System.out.println("Enter Quantity : ");
				int qty4=Sc.nextInt();
				 total4=total3+qty4*20;
                break;
        
		case 5:  System.out.println("Enter Quantity : ");
				int qty5=Sc.nextInt();
				 total5=total4+qty5*20;
                break;        
                
		case 6:  System.out.println("Enter Quantity : ");
				int qty6=Sc.nextInt();
				 total6=total5+qty6*20;
                break;        
                
		case 7:  System.out.println("Enter Quantity : ");
				int qty7=Sc.nextInt();
				 total7=total6+qty7*20;
                break;
                
		case 8:  System.out.println("Enter Quantity : ");
				int qty8=Sc.nextInt();
				 total8=total7+qty8*20;
                break;        
        
		case 9:  System.out.println("Enter Quantity : ");
				int qty9=Sc.nextInt();
				 total9=total8+qty9*20;
                break;
                
		case 10:
			totalbill=total1+total2+total3+total4+total5+total6+total7+total8+total9; 
			System.out.println("Total bill : " + totalbill);
                 break;        
                
                
                
		}
	}while(choice != 0);
		
		
		
		
	}

}
