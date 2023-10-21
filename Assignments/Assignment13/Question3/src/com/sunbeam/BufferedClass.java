package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedClass {

	public static void main(String[] args) 
	{
		try(FileWriter fw=new FileWriter("File1.txt"))
		{
			try(BufferedWriter bw=new BufferedWriter(fw))
			{
				for(int i=1;i<=4;i++)
				{
					System.out.println("Enter line");
					String line=new Scanner(System.in).nextLine();
					bw.write(line);
					bw.newLine();
				}	
			}
					
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("File saved");
		

	}

}
