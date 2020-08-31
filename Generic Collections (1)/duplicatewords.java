package com.assignment;

import java.util.HashMap;
import java.util.Scanner;

public class duplicatewords 
{
	public static void main(String[] args) {
	//Scanner sc = new Scanner(System.in);
	//String s1 = sc.next();
	String s = "Big black bug bit a big black dog on his big black nose";
	
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	
	HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
	char[] ch = s.toCharArray();
	for(char c : ch)
	{
		if(hm.containsKey(c))
		{
			int v = hm.get(c);
			hm.put(c, v+1);
			
		}
		else
		{
			hm.put(c, 1);
		}
	}
	
	System.out.println(hm);
	}

}
