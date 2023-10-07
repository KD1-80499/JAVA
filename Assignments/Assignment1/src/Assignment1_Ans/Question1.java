package Assignment1_Ans;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int num=Sc.nextInt();
		System.out.println("Given Number:"+num);
		
		String bs=Integer.toBinaryString(num);
		String os=Integer.toOctalString(num);
		String hs=Integer.toHexString(num);
		
		System.out.println("Binary Equivalen:"+bs);
		System.out.println("Octal Equivalent:"+os);
		System.out.println("Hexadecimal Equivalent:"+hs);
		
		Sc.close();
	}    
}
