package com.assignment;

public class salarycalculator
{
private String employeename;
private int hours;
private double salary;
private int extrahours;
private double rate;

public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getExtrahours() {
	return extrahours;
}
public void setExtrahours(int extrahours) {
	this.extrahours = extrahours;
}
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}

public double pay(int hours, double rate)
{
	if(hours > 40)
	{
		extrahours = hours - 40;
		salary = (hours * rate) + (extrahours * rate);
	}
	else {
		salary = hours *rate;
	}
	return salary;
}
public void displayemployee()
{
	System.out.println(salary);
}

}
