
/*
Remember that arraylists are good for adding and removing things,
and that they are clock-cycle friendlier in this case than resizing
arrays as we discussed in lecture. This lab allows you to get some
hands-on using an arraylist so you will remember it for those times
it would be a good fit for an application.

a) Create an Arraylist of type String and prompt the user for
three names and add these names to your ArrayList.

b) Print a message with the number of elements in the ArrayList
for the user using the size() method (to find the number to print.)

c) Prompt the user for two more names and add them to the ArrayList
and once again print a message with the number of elements in the ArrayList
for the user.

d) Use a loop to print all of the names in the ArrayList for the user.

e) Ask the user for a name to remove, remove the value the user provides,
and then use a loop to print all of the names in the ArrayList for the user.
*/

package com.donnie;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int counter = 0;


        ArrayList<String> names = new ArrayList<String>();

        while (counter < 3) {
            System.out.println("Please enter a name: ");
            names.add(input.next());

            counter++;
        }




        System.out.printf("Size of the array is: %s%n" , names.size());

        System.out.println("The names in the arraylist are: ");
         for (int i = 0; i < names.size(); i++)
            System.out.printf(" %s", names.get(i));
        System.out.println();

        counter = 0;

        while (counter < 2) {
            System.out.println("Please enter a name: ");
            names.add(input.next());

            counter++;
        }

        System.out.printf("Size of the array is: %s%n" , names.size());

        System.out.println("The names in the arraylist are: ");
         for (int i = 0; i < names.size(); i++)
            System.out.printf(" %s", names.get(i));
        System.out.println();


        System.out.println("Please enter a name to be removed: ");
        names.remove(input.next());


        System.out.printf("Size of the array is: %s%n" , names.size());

        System.out.println("The names in the arraylist are: ");

        for (int i = 0; i < names.size(); i++)
            System.out.printf(" %s", names.get(i));

    }
}
