////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  (your section number)
// 
//  Project:  csc251_0001_assn001A
//  File:     TestEmployee.java
//  
//  Name:     (your first and last name)
//  Email:    (your Wake Tech Email Address)
////////////////////////////////////////////////////////////////////////////////
package edu.waketech.csc251.hr.test;

import edu.waketech.csc251.hr.mgmt.Executive;
import edu.waketech.csc251.hr.mgmt.Manager;
import edu.waketech.csc251.hr.person.Employee;

/**
 * (Insert a comment that briefly describes the purpose of this class definition.)
 *
 * <p/> Bugs: (List any known issues or unimplemented features here)
 * 
 * @author (Insert your first and last name)
 *
 */
public class TestEmployee
{

	/**
	 * Constructs a new TestEmployee object. (Insert any further description that is needed)
	 */
	public TestEmployee()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * (Insert a brief description that describes the purpose of this method) 
	 *
	 * @param args
	 */
	public static void main(String[] args)
	{
        Employee employee = new Employee("Dilbert", 62000);
        Manager manager = new Manager("PointyHairedManager", 100050, "Engineering");
        Executive executive = new Executive("Catbert", 200000, "Engineering");
        System.out.println(employee.toString());
        System.out.println(manager.toString());
        System.out.println(executive.toString());
	}

}
