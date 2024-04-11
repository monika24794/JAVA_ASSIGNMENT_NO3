//Write a program by creating an &#39;Employee&#39; class having the following methods
//and print the final salary.
//a. &#39;getInfo()&#39; which takes the salary, number of hours of work per day of
//employee as parameter
//b. &#39;AddSal()&#39; which adds $10 to salary of the employee if it is less
//than $500.
//c. &#39;AddWork()&#39; which adds $5 to salary of employee if the number of hours of
//work per day is more than 6 hours.
package javaassignment3;

import java.util.Scanner;

public class Employee {
	private long salary;
	private int hoursworkprday;

	public void getInfo(long salary, int hoursworkprday) {

		this.salary = salary;
		this.hoursworkprday = hoursworkprday;
	}
	public void addSal() 
	{
    if ( salary < 500)
    {
    	salary =salary+10;
    }}
    public void addWork()
    { if (hoursworkprday>6)
    {
    	salary =salary+5;
    }
    	
	}
    @Override
	public String toString() {
		return "Employee [salary=" + salary + ", hoursworkprday=" + hoursworkprday + "]";
	}
	public static void main(String[] args) {
    	
    	 Employee employee =new Employee();
    	 employee.getInfo(50000, 10);
    	 employee.addSal();
    	 employee.addWork();
    	 System.out.println(employee);
	}
}


