package com.assignment;

public class employeemain
{
	public static void main(String[] args) {
		emplyeedetails e1 = new emplyeedetails();
		emplyeedetails e2 =  new emplyeedetails();
		
		e1.setfname("kaviya"); 
		e1.setlname("s");
		e2.setfname("john");
		e2.setlname("jack");
		e1.setsalary(23000);
		e2.setsalary(45000);
		System.out.println("monthly salary = " +e1.fname  +e1.lname  +e1.getsalary());
		System.out.println("monthly salary = " +e2.fname  +e2.lname  +e2.getsalary());
		System.out.println("yearly salary");
		System.out.println("yearly salary = " +e1.fname  +e1.lname  +e1.getsalary()*12);
		System.out.println("yearly salary = " +e2.fname  +e2.lname  +e2.getsalary()*12);
		System.out.println("yearly salary raise 10%");
		System.out.println("yearly salary = " +e1.fname  +e1.lname  +e1.getsalary()*1.1*12);
		System.out.println("yearly salary = " +e2.fname  +e2.lname  +e2.getsalary()*1.1*12);

	}

}
