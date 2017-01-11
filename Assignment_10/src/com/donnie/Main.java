


/*
Your company pays its sales staff on a commission basis.
Each employee receives $500 per week plus 6.5% of their sales.
For example, a salesperson who sells $10,000 worth of products will get a
salary of 500 + (10000 * .065) or $1150 for that week.


You are given the task of creating a program to allow a manager to
enter in the sales for 10 employees. (Store them in an array of course.)
Then it should display the 10 sales amounts,
the 10 salaries for this pay period, and the average salary.
*/


package com.donnie;
import java.util.Scanner;
public class Main {

    private static Scanner salesCatcher = new Scanner(System.in);

    public static void main(String[] args) {

        double[] mySales = getSales(10);

        int sum = 0;

        for (double d : mySales) sum += d;
        double average = 1.0d * sum / mySales.length;

        for(int i=0; i<mySales.length; i++) {
            System.out.println("Element " + i +", sales total entered was " + mySales[i]);
            System.out.println("Element " + i +", salary is " + ((mySales[i] * 0.65) + 500));

        }

        System.out.println();
        System.out.println("The average salary is " + average);
    }


    public static double[] getSales(int someNumber) {

        System.out.println("Enter " + someNumber + " sales total values. \r");
        double[] values;
        values = new double[someNumber];

        for(int i=0; i<values.length; i++) {
            values[i] = salesCatcher.nextDouble();

        }
        return values;
    }


}




