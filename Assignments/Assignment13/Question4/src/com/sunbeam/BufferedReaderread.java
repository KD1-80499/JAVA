package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReaderread {
	
	public static void main(String[] args) 
	{
		try(FileReader fr=new FileReader("/home/sunbeam/My_Personal_Git_Data/JAVA/Assignments/Assignment13/Question3/File1.txt"))
		{
			try(BufferedReader br= new BufferedReader(fr))
			{
				String line;
				while((line=br.readLine())!=null)
				{
					System.out.println(line);
				}
			}
					
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("File saved");
		

	}

}
