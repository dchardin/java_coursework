
/*

Your company has 4 grocery stores. Each store has 3 departments
where product presentation affects sales (produce, meat, frozen).
Every so often a department in a store gets a bonus for doing a really
good job.

You need to create a program that keeps a table of bonuses
in the system for departments. Create a program that has a two dimensional
array for these bonuses. The stores can be the rows and the departments
can be the columns. Have the program ask the user three times for a bonus
amount, grocery store number (1-4), and department number (1-3)
and add the bonus amount to the appropriate place in the array based on
the numbers they gave. After this is done, add up the bonuses
for each of the 4 stores [the 4 rows in your 2 dimensional array] and
display them for the user.



 */



package com.donnie;
import java.util.Scanner;
public class Main {

    private static Scanner inputCatcher = new Scanner(System.in);

    public static void main(String[] args) {

// General notes about multidimensional arrays (for my reference)

        //notice that this multidimensional array has two rows, each row with
        // four columns. Populated with random three digit numbers

//        int firstarray [] [] = {{842,963,103,112}, {125,132,145,152}};

        //notice that this multidimensional array has three rows.
        //first row has 4 columns, second row has one column, third row has
        //three columns

//        int secondarray [] [] = {{330,661,732,434}, {443}, {676,534,654}};

        //so I can create the array as follows:

        int storeSelection = 0;
        int deptSelection = 0;
        int bonusAmount = 0;
        int sumStore1 = 0;
        int sumStore2 = 0;
        int sumStore3 = 0;
        int sumStore4 = 0;
        int count = 0;

        int storeArray[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0, 0}};



        System.out.println("Welcome to the quarterly bonus tracking system");

        while (count < 3) {

            System.out.println("Please enter the bonus amount");
            bonusAmount = inputCatcher.nextInt();

            System.out.println("Please enter the number of the store that you want to work with: 1 through 4");
            storeSelection = inputCatcher.nextInt() -1;

            System.out.println("Please enter the department that you wish to work with: (1,2,or 3)");
            deptSelection = inputCatcher.nextInt() -1;


            storeArray[storeSelection][deptSelection] = bonusAmount;

            count++;

            display(storeArray);

            sumStore1 = storeArray[0][0] + storeArray[0][1] + storeArray[0][2];
            sumStore2 = storeArray[1][0] + storeArray[1][1] + storeArray[1][2];
            sumStore3 = storeArray[2][0] + storeArray[2][1] + storeArray[2][2];
            sumStore4 = storeArray[3][0] + storeArray[3][1] + storeArray[3][2];


        }
            System.out.println("bonus total for Store 1 is: "+sumStore1);
            System.out.println("bonus total for Store 2 is: "+sumStore2);
            System.out.println("bonus total for Store 3 is: "+sumStore3);
            System.out.println("bonus total for Store 4 is: "+sumStore4);

    }

    public static void display(int x[] []){

        for (int row=0; row < x.length; row++ ) {
            for (int column=0; column < x[row].length;column++) {
                System.out.print(x[row] [column]+"\t");
            }
            System.out.println();

        }


    }
}

