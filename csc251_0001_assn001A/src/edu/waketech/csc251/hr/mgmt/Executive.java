////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  (your section number)
// 
//  Project:  csc251_0001_assn001A
//  File:     Executive.java
//  
//  Name:     (your first and last name)
//  Email:    (your Wake Tech Email Address)
////////////////////////////////////////////////////////////////////////////////
package edu.waketech.csc251.hr.mgmt;

/**
 * (Insert a comment that briefly describes the purpose of this class definition.)
 *
 * <p/> Bugs: (List any known issues or unimplemented features here)
 * 
 * @author (Insert your first and last name)
 *
 */
public class Executive extends Manager
{

	private double bonus;
	/**
	 * Constructs a new Executive object. (Insert any further description that is needed)
	 * @param name
	 * @param salary
	 * @param dept
	 */
	public double getBonus()
	{
		return bonus;
	}
	
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	
	public Executive(String name, double salary, String dept)
	{
		super(name, salary, dept);
		// TODO Auto-generated constructor stub
		// TODO couldn't quite figure out how to calculate new salary and pass it.
	}

}
