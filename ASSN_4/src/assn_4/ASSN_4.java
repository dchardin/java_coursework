/*
Create a java program that has a code file with main() in it and another code 
file with a separate class. You will be creating objects of the class in the 
running program, just as the chapter example creates objects of the Account 
class.

Your system handles employee records and processes payroll for them. 
Create a class called Employee that holds the following information: 

first name, last name, monthly salary, and sales bonus. 
The class should have all the gets and sets and have a method to report the 
yearly salary (which is the monthly salary * 12 + the sales bonus.)

[Note: Before anyone asks. You cannot have spaces in variable names. 
So you might call the first one firstName, first_name, fname or any other 
appropriate and legal variable name. The write up above is telling you the 
information to be stored in English, not java.]

Create 2 objects of Employee in your main code class and display their names, 
monthly, and yearly salaries. Then give them each a 100 pay raise to their 
monthly salary. (Hint: use the get() to read it out to a variable, add 100, 
then use the set() to store it back in) Then display their names, monthly, 
and yearly salaries again.

[Note2: You can hard code the names, and salaries you are storing in the 
2 employee objects or ask the used for them with a Scanner. 
Either way is fine. It is perfectly all right from a grading standpoint 
to just give it test values like the chapter example does.] 

 */
package assn_4;

/**
 *
 * @author donnie
 */
public class ASSN_4 {
    
    private String firstName;
    private String lastName;
    private double monthSalary;
    private double salesBonus;
    
    
    public ASSN_4(String firstName, String lastName, double monthSalary, double salesBonus)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthSalary = monthSalary;
        this.salesBonus = salesBonus;
   
        
    }

    //method that sets the first name
    
    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    //method that returns the first name
    
   public String getfirstName()
   {
       return firstName;
   }
    
    //method that sets the last name
   
   public void setlastName(String lastName)
   {
       this.lastName = lastName;
   }
    
   //method that returns the last name
   
   public String getlastName()
   {
       return lastName;
   }
    
   //method that sets the monthly salary
   
   public void setmonthSalary(double monthSalary)
   {
       this.monthSalary = monthSalary;
   }
   
   //method that returns monthly salary
   
   public double getmonthSalary()
   {
       return monthSalary;
   }
   
   //method that sets the sales bonus
   
   public void setsalesBonus(double salesBonus)
   {
       this.salesBonus = salesBonus;
   }
           
   //method that returns salesBonus
   
   public double getsalesBonus()
   {
       return salesBonus;
       
   }
   
   
   //method that gets the yearly salary
   
   public double getyearlySalary()
   {
       return monthSalary * 12 + salesBonus;
   }
   
}
