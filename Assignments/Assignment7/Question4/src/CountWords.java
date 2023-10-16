import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) 
	{
		String s;
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		s=s.trim();
		String[] words=s.split("\\s+");
		int wordcount=words.length;
		System.out.println("Number count="+wordcount);
			
	}

}
