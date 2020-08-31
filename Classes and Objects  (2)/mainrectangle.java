package com.assignment;

public class mainrectangle {

	public static void main(String[] args) {
		
		rectangle re = new rectangle();

        System.out.println("Area and perimeter of default rectangle ");

        displayRectData(re);

        re = new rectangle(12, 10);

        System.out.println("Area and perimeter of  new rectangle");

        displayRectData(re);

    }

    public static void displayRectData(rectangle r) {

        System.out.println("Current Dimensions:\n "+ r);

        System.out.printf("Area of Rectangle: %.2f\nPerimeter of Rectangle: %.2f\n\n",

        r.computeArea(), r.computePerimeter());

    }

	}


