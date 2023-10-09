package com.sunbeaminfo.invoicetest;

import com.sunbeaminfo.invoice.Invoice;

public class InvoiceTest
{
	public static void main(String args[])
	{
		Invoice invoice=new Invoice();
		
		invoice.acceptData();
		System.out.println("Invoice amount="+invoice.calculateAmt());
		
	}
}