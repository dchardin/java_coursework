////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  (your section number)
// 
//  Project:  csc251_0001_assn001A
//  File:     Manager.java
//  
//  Name:     (your first and last name)
//  Email:    (your Wake Tech Email Address)
////////////////////////////////////////////////////////////////////////////////
package edu.waketech.csc251.hr.mgmt;

import edu.waketech.csc251.hr.person.Employee;

/**
 * (Insert a comment that briefly describes the purpose of this class definition.)
 *
 * <p/> Bugs: (List any known issues or unimplemented features here)
 * 
 * @author (Insert your first and last name)
 *
 */
public class Manager extends Employee
{

	/**
	 * Constructs a new Manager object. (Insert any further description that is needed)
	 * @param name
	 * @param salary
	 */
	
	private String department;
	
	public Manager(String name, double salary, String dept)
	{
		super(name, salary);
		// TODO Auto-generated constructor stub
		department = dept;
	}

	public String toString()
	{
        return super.toString() + " is manager of " + department + " department";
	}
}
