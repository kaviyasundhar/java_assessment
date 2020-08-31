package com.assignment;

import java.util.Scanner;

public class duplicateelimation {

	public static void main(String[] args) {
		int i=0;
		int temp[]=new int[100];
		
		Scanner input=new Scanner(System.in);
		
		do{
			System.out.println((i+1)+ " "+"number");
			int n=input.nextInt();
			
			if(ele (temp, n)==false)
			{
				temp[i]=n;
				i++;
			}
			else if(ele(temp,n)==true)
			{
				System.out.println("duplicate number is");
			}
		}while(i<10);
	}
	
	private static boolean ele(int temp[], int n)
	{
		for (int i = 0; i < temp.length; i++) 
		{
			if(temp[i]==n)
			{
				return true;
			}	
		}
		return false;
	}

}
