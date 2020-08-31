package com.assignment;

import java.util.Scanner;

public class onlineretailer 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double retail = 0;
	int productnum;
	int quanitysold;
	boolean flag = false;
	while(flag = true)
	{
		System.out.println("1 - Product 1, $2.98");
		System.out.println("2 - Product 2, $4.50");
		System.out.println("3 - Product 3, $9.98");
		System.out.println("4 - Product 4, $4.49");
		System.out.println("5 - Product 5, $6.87");
		System.out.println("6 - Exit program");
		
		
		System.out.print("Enter product number: ");
		productnum = sc.nextInt();
		if(productnum == 6) {
			break;
		}
		System.out.print("Enter quanity sold: ");
		quanitysold = sc.nextInt();
		
		
		switch(productnum)
		{
		case 1:
			retail = retail + 2.98 * quanitysold;
			break;
		case 2:
			retail = retail + 4.50 * quanitysold;
			break;
		case 3:
			retail = retail + 9.98 * quanitysold;
			break;
		case 4:
			retail = retail + 4.49 * quanitysold;
			break;
		case 5:
			retail = retail + 6.87 * quanitysold;
			break;
		default:
			break;
		}
		System.out.println(retail);
	}
	
}
}
