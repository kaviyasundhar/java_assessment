package com.assignment;
import java.io.*;

public class exceptionmain {

	

	public static void main(String[] args) {
		
	
		try {
			getexceptionB();
		}
		catch(exceptionA eA1 )
		{
			eA1.printStackTrace();
		}
		
		try {
			getexceptionC();
		}
		catch(exceptionA eA1 )
		{
			eA1.printStackTrace();
		}
	}
		public static void getexceptionA() throws exceptionA
		{
			throw new exceptionA("Exception A");
			
		}
		public static void getexceptionC() throws exceptionA
		{
			throw new exceptionC("Exception c");
		
		}
		public static void getexceptionB() throws exceptionA
		{
			throw new exceptionB("Exception B");
		
			
		}
		
	

	

}
