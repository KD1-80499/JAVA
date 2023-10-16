import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
      String s;
      String r="";
      
      System.out.println("Enter String");
      Scanner sc=new Scanner(System.in);
      s=sc.next();
      
      for(int i=s.length()-1;i>=0;i--)
      {
    	  r=r+s.charAt(i);
      }
//      System.out.println(r);
      {
    	  if(s.equals(r))
    	  {
    		  System.out.println("String is palindrome");
    	  }
    	  else
    	  {
    		  System.out.println("String is NOT palindrome");
    	  }
      }
	}

}
