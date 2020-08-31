package com.assignment;

import java.io.IOException;

public class ioexception {

	public static void main(String[] args) throws IOException  {
		info();
	}
	private static void info() throws IOException
	{
		System.out.println("hello");
		throw new IOException();
	

	}

}
