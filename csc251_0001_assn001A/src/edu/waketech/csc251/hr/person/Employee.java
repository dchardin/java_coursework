////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  (your section number)
// 
//  Project:  csc251_0001_assn001A
//  File:     Employee.java
//  
//  Name:     (your first and last name)
//  Email:    (your Wake Tech Email Address)
////////////////////////////////////////////////////////////////////////////////
package edu.waketech.csc251.hr.person;

/**
 * 
 * Write a class Employee with a name and salary.  
 * Have (at least) getters for name and salary.  
 * Whether you have setters or some other mechanism 
 * to set name and salary is up to you.  
 * Employee should be in package edu.waketech.csc251.hr.person.
 * 
 * <p/> Bugs: (List any known issues or unimplemented features here)
 * 
 * @author (Insert your first and last name)
 *
 */
public class Employee
{
	private String name;
	private double salary;
	
	public Employee(String name, double salary) 
	{
		this.name = name;
		this.salary = salary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public String toString(){
        return "Employee " + name + " makes this amount per year " + salary;
    }
	
}
