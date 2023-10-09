
package com.sunbeaminfo.invoice;

import java.util.Scanner;

public class Invoice 
{
  private String partno;
  private String partdescription;
  int qty;
  double price;
  
 public Invoice()
{
  	this.partno = "A";
  	this.partdescription = "";
  	this.qty = 0;
  	this.price = 0;
}  
public Invoice(String partno, String partdescription, int qty, double price)
{
	this.partno = partno;
	this.partdescription = partdescription;
	this.qty = qty;
	this.price = price;
}
public String getPartno() {
	return partno;
}
public void setPartno(String partno) {
	this.partno = partno;
}
public String getPartdescription() {
	return partdescription;
}
public void setPartdescription(String partdescription) {
	this.partdescription = partdescription;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public void acceptData()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter partno=");
	partno=sc.next();
	System.out.println("Enter partdescription=");
	partdescription=sc.next();
	System.out.println("Enter quantity=");
	qty=sc.nextInt();
	if(this.qty<=0)
	{
		this.setQty(0);
	}
	System.out.println("Enter price=");
	price=sc.nextDouble();
	if(this.price<0)
	{
		this.setPrice(0.0);
	}
	
}
public double calculateAmt()
{
	double amt;
	amt=this.price*this.qty;
	
	return amt;
	
}

}


