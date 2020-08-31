package com.assignment;

import java.util.Scanner;

public class genericequaltomethod {
	
	public static <G> boolean isequalto (G n, G m )
	{
		if(n.equals(m))
		{
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		int a , b;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the two interger value :");
		a = scan.nextInt();
		b = scan.nextInt();
		if(isequalto(a,b) == true)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		
		Object obj = new Object();
		Object obj1 = new Object();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the object value:");
		obj = sc.next();
		obj1 = sc.next();
		if(isequalto(obj , obj1) == true)
				{
			System.out.println("true");
				}
		else
			System.out.println("false");
	}

}
