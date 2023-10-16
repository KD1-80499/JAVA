import java.util.Scanner;

public class Reverse {

	public static void main(String[] args)
	{
		String s;
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(""+s.charAt(i));
		}
	  sc.close();
	}

}
