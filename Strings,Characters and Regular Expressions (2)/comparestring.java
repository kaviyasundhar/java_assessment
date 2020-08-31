package com.assignment;

import java.util.Scanner;

public class comparestring {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first string");
	String s1 = sc.next();
	System.out.println("enter the second string");
	String s2 = sc.next();
	System.out.println(s1.equals(s2));
	System.out.println(s1.compareTo(s2));
	System.out.println(s2.compareTo(s1));
	
}
}
