<<<<<<< HEAD

=========


Intro
-----

Java coursework from CSC 151

Assignment 2
-------------


  Write a payroll calculation program. You need to ask the user for a number of
  hours and a pay rate. Once you have these two values from the user, find 
  their gross pay for the week. Withhold 15% of their pay (for taxes and social
  security) and find their net pay.

  Remember that you must give overtime pay… ( 1.5 * (hours - 40) * payrate)  
  …for the overtime hours in gross pay if the user worked over 40 hours, 
  so you will need to use an IF statement in this program to check if there are
  over 40 hours and handle regular time under one path, ….and payrate times 40 
  hours [for the first 40 hours] + overtime using the calculation above for the
  extra hours under the other path.

  You should print out the gross pay, withheld amount, and the net pay for the 
  user with appropriate text telling the user what each number is.

  Note: You may want to skip the formatting placeholders because you will need 
  to use doubles or floats as the data types here. If you do wish to use them, 
  do not use %d as it is for an integer. Use %f as is shown on page 87.


![GIF demo](readme_resources/csc_151_assn2.gif)




Assignment 4
------------


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




![GIF demo](readme_resources/csc_151_assn4.gif)


Assignment 5
------------

You are writing a billing program that adds up the items a user enters. 
Your program should use a loop and prompt the user for the item number for 
each item in inventory to add to the bill. 
(You can ask the user for the number of items you will enter and use a counter 
controlled loop or a sentinel controlled loop that has a stop number. 
Either way is fine.) Here is the table of items in inventory:


Item Value

1 209.00
2 129.50
3 118.00
4 232.00


(So if your program starts asking the user for the items they are purchasing 
and they enter item 2 with quantity 2, and item 3 with quantity 1. 
The bill should be 377.00. On the next run if your program asks the user for 
items in the loop and they give enter each item with quantity of 1. The bill 
should be 688.50)


Assignment 6
------------


![GIF demo](readme_resources/csc_151_assn6.gif)


Assignment 7
------------


![GIF demo](readme_resources/csc_151_assn7.gif)



Assignment 8
------------


Create a system for a halloween candy vending system. Your products should be:
Mini-Candy Bars, Bubble Gum Packs, Popcorn Balls, Gummy Monsters.

Hard code a price for each item. The system should ask the user which item they
would like. If the user is finished, a total cost should be displayed.


![GIF demo](readme_resources/csc_151_assn8.gif)


Assignment 9
------------

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



![GIF demo](readme_resources/csc_151_assn9.gif)



Assignment 10
-------------

Your company pays its sales staff on a commission basis.
Each employee receives $500 per week plus 6.5% of their sales.
For example, a salesperson who sells $10,000 worth of products will get a
salary of 500 + (10000 * .065) or $1150 for that week.


You are given the task of creating a program to allow a manager to
enter in the sales for 10 employees. (Store them in an array of course.)
Then it should display the 10 sales amounts,
the 10 salaries for this pay period, and the average salary.



![GIF demo](readme_resources/csc_151_assn10.gif)




Assignment 11
-------------


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


![GIF demo](readme_resources/csc_151_assn11_a.gif)



Assignment 11_b
---------------


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



![GIF demo](readme_resources/csc_151_assn11_b.gif)


Assignment 13_A
---------------


![GIF demo](readme_resources/csc_151_assn13.gif)


Assignment 13_B
---------------


![GIF demo](readme_resources/csc_151_assn13_b.gif)


Assignment carlot
-----------------

Overall Situation:

You work for a company that sells cars and services cars.
You have been instructed to write a program to help keep track of these
operations for the store manager. Your company is moving to an object oriented
programming system for all of its software, so you will have to create a car
class and use it in your program. Besides creating the cars when the user
chooses, the user can also change information about a car they choose. You will
need to incorporate error handling to make sure that incorrect values are not
stored if the user enters them for a change. There are also menu options for
specific reports you should show on the screen when the user selects those
options.

Car Class:

Your system works with cars. Each car has the following
information it keeps: vin (a string), make (a string), model(a string), year (a
number greater than 1970), mileage(a number not less than zero), price(a
floating point number greater than 1000.)

Menu:

You need to have a menu system for this program. The user should be allowed to
do several different things and each time returning to the main menu when they
are done.

Main System Features/Processes:

#####

Here are the main functional features your system has to have for the user:

#####

Ability to add a car to the array and set all of the values for it with input
from the user

Ability to ask the user which car in the array they wish to change in some way,
and then make that change.  (Hint: Have it in a separate method you are calling
and print a message and ask them what they want to change and number them so
you can do a separate If/Else or Switch. Then ask them for the value to change
it to, and do it there. …don’t try to do it in the main menu.)

Display a message with all the data for a car the user chooses.

Display the data for all the cars (currently in the array) for the user.

Display the average mileage for all of the cars on the lot.

Display the lowest price for all of the cars on the lot.

Make an Offer. This is a printout as if to show a customer with the list price,
a discount, and the asking price. It should ask the user to choose if he/she
feels the customer likes the car, somewhat likes the car, or is not easily
swayed. Customers liking the car get a $100 discount, somewhat liking the car
get a $200 discount, and not easily swayed get a $500 discount.


Here are the additional non-functional requirements:


This program must have at least one array. For simplicity the maximum number of cars on-site at any time is going to be 20.

This program must have multiple methods. Do not code the menu and all of the things it is doing all in main. There should be a reasonable amount of methods to handle the features this program is doing.

There should be error handling.
At least one output statement should show formatting to two decimal places when printing the price of a car (to demonstrate the technique.)

At least one of the functions above should incorporate a loop (which almost goes without saying here but by putting it here specifically it can be on the rubric/grade sheet.)

At least one of the functions above or the functions in the class should incorporate If statements (which almost goes without saying here but by putting it here specifically it can be on the rubric/grade sheet.

Ruberic:::


Is sound and correct as a program
(Measure of errors, wasted code, overall program quality)
Car Class overall
Error handling within Set Methods (or elsewhere in program even though the set methods would be the best place) for the numeric values.
Menu System
Ability: User Adds a Car
Ability: Display Car the User chooses
Ability: Display all cars for the user
Ability: Display Average Miles of cars for user
Ability: Display lowest priced car for user
Ability: Display Make an Offer for a selected car with the appropriate discount
(The requirements below will be filled within the major functions above.)
Requirement: Program must demonstrate an array
Requirement: Program must be broken up into methods for major functions.
(Demonstrating methods and method calling in this language.)
Requirement: Program must demonstrate error handling
Requirement: Program must demonstrate formatting on at least one number.
Requirement: Program must have at least one loop.
Requirement: Program must have at least one IF statement or a switch


![GIF demo](readme_resources/csc_151_carlot.gif)





=======
# java_coursework
Housing my java assignment solutions
>>>>>>> 1bca811b9ee78f53fbbaf82b60a0e34f04d2e4bd
