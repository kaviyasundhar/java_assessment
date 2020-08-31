package com.assignment;

import java.util.Scanner;

public class temperature 
{

public static void main(String[] args) {
	double tempconvert;
	int choice;
	double fahrenheit;
	double celsius;
	double c; 
	double f;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Ener your choice");
	choice = sc.nextInt();
	
	switch(choice) 
	{
	case 1:
		System.out.println("Enter the Fahrenheit temperature");
		fahrenheit = sc.nextDouble();
		 c  = (fahrenheit-32)*5/9;
		 System.out.println("Celsius"  +c);
		 break;
	case 2:
		System.out.println("Enter the Fahrenheit temperature");
		celsius = sc.nextDouble();
		 f = (9.0 / 5.0) * celsius + 32;
		 System.out.println("fahrenheit"  +f);
		 break;
	default :
		System.out.println("please enter the correct choice ");
		break;
	}



}

}
