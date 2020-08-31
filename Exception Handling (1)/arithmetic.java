package com.assignment;

public class arithmetic
{
public static void main(String[] args) {
 try {
		int a = 10/0;
 }
 catch(ArithmeticException e)
 {
	 e.printStackTrace();
 }
finally
{
	System.out.println("exception received");
}
}
}
