import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter string: ");
         String str = sc.nextLine();
         System.out.println("Length of string is : " +str.length());
         try {
        	 if(str.length() > 80) {
        		 throw new ExceptionLineTooLong();
        	 }
         }
         catch(ExceptionLineTooLong e) {
        	 e.printStackTrace();
        	 System.out.println(e);
         }
         System.out.println("Entered string is: " +str);
         
      sc.close();   
         
	}
}