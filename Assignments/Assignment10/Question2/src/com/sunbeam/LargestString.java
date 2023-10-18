package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestString 
{

	public static void main(String[] args)
	{
     List<String> list = new ArrayList<String>();          

     list.add("swaroopa");  
     list.add("yash");  
     list.add("ganesh");  
     list.add("manisha");  
     list.add("geetanjali");                    
     
     class FindMax implements Comparator<String>
     {
		@Override
		public int compare(String s1, String s2)
		{
			int diff=s1.length()-s2.length();
			return diff;
		}     
     }
     FindMax comparator=new FindMax();
     System.out.println("Max String in list is:"+Collections.max(list,comparator));
	}
}
