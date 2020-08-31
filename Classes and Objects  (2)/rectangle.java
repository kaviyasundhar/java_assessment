package com.assignment;

import java.text.DecimalFormat;

	public class rectangle {

	    private double rlength;

	    private double rwidth;

	    public rectangle() {

	        this(1.0, 1.0);

	    }

	    public rectangle(double rlength, double rwidth) {

	        this.rlength = verifyLenWidValue(rlength);

	        this.rwidth = verifyLenWidValue(rwidth);

	    }

	    public double getLength() {

	        return rlength;

	    }

	    public double getWidth() {

	        return rwidth;

	    }

	    public void setLength(double rlength) {

	        this.rlength = verifyLenWidValue(rlength);

	    }

	    public void setWidth(double rwidth) {

	        this.rwidth = verifyLenWidValue(rwidth);

	    }

	    public double computePerimeter() {

	        return (rlength * 2) + (rwidth * 2);

	    }

	    public double computeArea() {

	        return rlength * rwidth;

	    }

	    public String toString() {

	        DecimalFormat dfmt = new DecimalFormat("#,##0.00");

	 

	        return "Length: " + dfmt.format(rlength) + "\nWidth: " +

	                dfmt.format(rwidth);

	    }

	    private double verifyLenWidValue(double value) {

	        if (value < 0) {

	            throw new IllegalArgumentException("Argument is negative.");

	        }

	        else if (value > 20) {

	            throw new IllegalArgumentException("Argument is greater than 20.");

	        }

	        else return value;

	    }

	}


