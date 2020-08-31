package com.assignment;

import java.util.Scanner;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import java.util.Set;

public class DuplicateElimination
{
	public static void main(String[] args) {

		String fName;

        Scanner input = new Scanner(System.in);
        String[] names = new String[10];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter First Name: ");
            names[i] = input.nextLine();
        }
        
        List<String> list = Arrays.asList(names);

        
        System.out.printf("%s ", list);
        System.out.println();

        removeDuplicates(list);

    }

    
    private static void removeDuplicates(Collection<String> values) {

        
        Set<String> set = new HashSet<String>(values);

       
        for (String value : set) {
            System.out.printf("%s ", value);
        }

        System.out.println();

    }

 
}

