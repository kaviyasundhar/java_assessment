package com.assignment;

public class array {

	public static void main(String[] args) {
	
	try {
	
			int a[] = new int[5];
			System.out.println(a[6]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
	}
	System.out.println( "Exception recived" );
	}

}
