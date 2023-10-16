
import java.util.Scanner;

public class ExceptionLineTooLong extends Exception 
{
	private static int length=80;

  
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong [length=" + length + "]";
	}
	
 public class Test{
	
	public void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Describe your personality");
		String str = sc.nextLine();
		try 
		{
		 if(str.length()>80)
		 {
			throw new ExceptionLineTooLong();
		 }
		 else
		   {
			 System.out.println("Description="+str);
		   }
		}
		 catch(ExceptionLineTooLong e)
		 {
			 System.out.println("The String is too Long");
		 }
		 {		   
	 }

	}
 }	
}		
	

	
	

	