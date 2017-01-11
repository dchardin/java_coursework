package com.donnie;

/*


Create a program with the following requirements:

1. It must have 4 randomly generated numbers in main.  (You can do more if you
wish if you want to play with this one.) These numbers should have values in the
range 1-10.

1.a. Make sure to print their values for the user. This is the way to test and
see what they are.

2. You must write a custom method to find the average of 4 numbers, and write an
overloaded version of the same method (with the same name...its an overloaded
method) that takes only 3 numbers and a string value as parameters. The first
version should just return the average of 4 numbers. The second one should
return the average of 3 numbers and print a message saying "Finding the average
of all except " + [value of the string passed in]

2.a Write test code to call each method from main. Test the first one with all
four random numbers and report the results. Then test the second one passing the
first three random numbers and pass the message "the fouth random number" (to
tell that its the fourth one that is not in the set when it is printed.)

.....just to be clear, you are writing an overloaded method that takes 4 numbers
as parameters....and a second version of the same method that takes 3 numbers
and a string. If you do not have both of these methods and if they are not both
the exact same name....there will be deductions on this program. [Last year
there was some confusion on this as to why its being assigned and has 2 methods
of the same name and what was being done here. It's an excercise to get you to
write an overloaded method.]


3. Use techniques you know and the Math class functions to report the smallest
value of your four numbers. (You might want to write a separate method to do
this. The min method can only check two of them at a time in this language. You
will have to do a series of them in some way to find the minimum of all four and
return it.)


4. Finally...you need to send a random message to the user at the end. It should
be one of the following: "Thank you for playing", "Have a Nice Day", "Goodbye
Wally World", or "So Long Folks"

(Hint: You can't make random strings...but you know there are 4 of them...and
you can make a random integer for 1-4. This sounds like a job for a random
number and a nested IF or a Case Statement)



 */


/*

I first laid eyes on this assignment on Saturday, 12:23pm, October 22, 2016.

Did not get much out of the previous weeks lecture, didn't even know what
method overloading was. I could tell from skimming over the assignment that
it would require method overloading, as well as trickery with the Math class.

I spent most of Saturday trying to get back into the groove with methods. I 
worked through a good chunk of Tim Buchalka's "Complete Java Development Course"
on Udemy.

I took periodic breaks and worked through the material at a leisurly pace. By 11pm
I had reached the method overloading lesson. Armed with a good grasp on the prereqs
thanks to the previous lessons, method overloading turned out to be quite an easy
concept to understand. Decided to hold off on active work on the lesson until Sun.
morning.

On Sunday, I began active work on the assignment at 12:30pm. I took time reading
over the requirements and sketched out an event diagram and raw pseudocode on my
notepad. I didn't have to divert far from my initial plans, just had to refer to
syntax guidelines and class documentation from time to time. Had to figure out
what class to use to generate my random numbers, easy find.

Steady pace on work, periodic stretch breaks and eye rests. Did all of the work
at Geeksboro in Greensboro. Turned in completed code for grading at 5:50pm, so
about 5.5 hours of code work, and 11 hours of pre-learning (if you account for breaks)

*/



import java.security.SecureRandom;


public class Main {

    public static void main(String[] args) {


        SecureRandom randomNumbers = new SecureRandom();


        double myRand1 = 1 + randomNumbers.nextInt(10);
        double myRand2 = 1 + randomNumbers.nextInt(10);
        double myRand3 = 1 + randomNumbers.nextInt(10);
        double myRand4 = 1 + randomNumbers.nextInt(10);


        double newAvg = avgFinder(myRand1, myRand2, myRand3, myRand4);

        System.out.println("The average of the four numbers is " + newAvg );

        double newerAvg = avgFinder(myRand1, myRand2, myRand3, "whatever the fourth one is... ");

        System.out.println("The average of the three numbers is " + newerAvg );

        double min = minFinder(myRand1, myRand2, myRand3, myRand4);

        System.out.println("The minimum value of the four numbers is " + min );

        goodbyeGenerator();
    }



    public static double avgFinder(double rand1, double rand2, double rand3, double rand4) {

        System.out.println();
        System.out.println("The first random number generated is " + rand1);
        System.out.println("The second random number generated is " + rand2);
        System.out.println("The third random number generated is " + rand3);
        System.out.println("The fourth random number generated is " + rand4);
        System.out.println("Calculating the average of the four numbers.... ");
        System.out.println();

        return ((rand1 + rand2 + rand3 + rand4) / 4) ;

    }

    public static double avgFinder(double rand1, double rand2, double rand3, String string1) {

        System.out.println();
        System.out.println("The first random number generated is " + rand1);
        System.out.println("The second random number generated is " + rand2);
        System.out.println("The third random number generated is " + rand3);
        System.out.println("Calculating the average of numbers except " + string1 );
        System.out.println();

        return ((rand1 + rand2 + rand3) / 3);

    }

    public static double minFinder(double rand1, double rand2, double rand3, double rand4) {

        System.out.println();
        double subMin1 = Math.min(rand1, rand2);
        double subMin2 = Math.min(rand3, rand4);

        return Math.min(subMin1, subMin2);

    }


    public static void goodbyeGenerator() {

        SecureRandom arandomnum = new SecureRandom();

        int byeNumber = 1 + arandomnum.nextInt(4);

        System.out.println();

        switch (byeNumber)

        {

            case 1:
                System.out.println("Thank you for playing!");
                break;

            case 2:
                System.out.println("Have a nice day!");
                break;

            case 3:
                System.out.println("Goodbye Wally World!");
                break;

            case 4:
                System.out.println("So Long Folks!");
                break;

        }


    }

}
