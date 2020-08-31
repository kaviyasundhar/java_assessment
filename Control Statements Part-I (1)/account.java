package com.assignment;

import java.util.Scanner;

public class account {
	public static void main(String[] args) {
		int account = 1, balance, charges, credits, credit_limit, newbal;
		Scanner scan = new Scanner (System.in);
		while( account != 0 )
		{
			System.out.println("Enter the account num");
			account = scan.nextInt();
			
			
			System.out.println("enter the balance");
			balance = scan.nextInt();
			
			System.out.println("Enter the chargers");
			charges = scan.nextInt();
			
			System.out.println("enter the credits");
			credits = scan.nextInt();
			
			System.out.println("enter the credit limit");
			credit_limit = scan.nextInt();
			
			newbal = balance + charges - credits;
			System.out.println("new balance is " +newbal);
			
			if ( newbal > credit_limit) 
			{
			System.out.println("cerdit limit exceeded");	
			break;
			}
			
		}


	}

}
