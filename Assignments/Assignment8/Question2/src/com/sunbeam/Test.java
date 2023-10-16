package com.sunbeam;


class Box<T>
{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

public class Test {
	
	public static class Main
	{
		public static void printDisplayableBox(Box<? extends Displayable>b)
		{
			b.getObj().display();
		}
		public static void printBox(Box<?>b)
		{
		 System.out.println(b.getObj().toString());	
		}
	

	public static void main(String[] args) 
	{
	
	Person p1=new Person();
	p1.accept();
	Box<Person> b1=new Box<>();
	b1.setObj(p1);
	
     Box<Date> b2=new Box<>();
     b2.setObj(new Date(1,1,2000));
     printDisplayableBox(b2);
     
     Box<String>b3=new Box<>();
     b3.setObj("Hello");
//     printDisplayableBox(b3);
     
     printBox(b3);
     printBox(b2);
     printBox(b1);
     

	}
	}
}
