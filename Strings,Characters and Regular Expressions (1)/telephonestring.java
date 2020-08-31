package com.assignment;

import java.util.Scanner;

public class telephonestring
{

	public static void main(String[] args) {
		long phoneNum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your telephone number");
		phoneNum = sc.nextLong();
		
		System.out.println(String.valueOf(phoneNum).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
		}
	
	
}

