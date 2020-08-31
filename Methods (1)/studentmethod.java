package com.assignment;

import java.util.Scanner;

public class studentmethod {
	
	
	static int stud(int avg)
	{
		if(avg>=90) 
			return 4;
		
		else if(avg>=80)
		return 3;
		
		else if(avg>=70)
			return 2;
		
		else if(avg>=60)
			return 1;
		
		else
		return 0;
		
	}
	public static void main(String[] args) {
		int qualitypoint;
		int average = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the quality point");
		qualitypoint = sc.nextInt();
		System.out.println(stud(qualitypoint));
		
	}
}

