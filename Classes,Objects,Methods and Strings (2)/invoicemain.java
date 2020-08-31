package com.assignment;

public class invoicemain {

	public static void main(String[] args) {
		
		
		
		invoice spanner = new invoice("123", "A Spanner", 15, 12.5);
		
		invoice hammer = new invoice("124", "A Hammer", -1, -15.0);
		System.out.println(spanner.getPartNumber());
		System.out.println(spanner.getPartDescription());
		System.out.println(spanner.getQuantity());
		System.out.println(spanner.getUnitPrice());
		System.out.println(spanner.getInvoiceAmount());
		
		
		System.out.println(hammer.getPartNumber());
		System.out.println(hammer.getPartDescription());
		System.out.println(hammer.getQuantity());
		System.out.println(hammer.getUnitPrice());
		System.out.println(hammer.getInvoiceAmount());
		
		
	}

}
