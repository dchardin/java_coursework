package com.donnie;

import java.util.Collections;
import java.util.Scanner;
import static java.lang.Math.*;
import java.util.ArrayList;



public class Main {



    public static Car carsArray[] = new Car[20];

    public static int objectCounter = 0;

    public static void main(String[] args) {

        menu();

    }


    public static void menu() {

        int selection = 0;

        //Menu selection output

        System.out.println("Welcome to the car system!");

        System.out.println();

        System.out.println("To add a car, press 1: ");

        System.out.println("To make a change to a car, press 2: ");

        System.out.println("To view info on all cars, press 3: ");

        System.out.println("To view info on a particular car, press 4: ");

        System.out.println("To view average mileage of all cars, press 5: ");

        System.out.println("To view the lowest priced car, press 6: ");

        System.out.println("To begin a sale, press 7: ");

        //scanner object

        Scanner input = new Scanner(System.in);


        // case statements

        // each case statement will trigger a different method. For now (while i am still developing
        // the methods, each one is just outputting a number


        selection = input.nextInt();


        switch (selection)

        {

            case 1:
                addCar();
                break;

            case 2:
                makeChange();
                break;

            case 3:
                viewInfoAll();
                break;

            case 4:
                viewInfoCar();
                break;

            case 5:
                viewAvgMilesAll();
                break;

            case 6:
                viewLowestPriceAll();
                break;

            case 7:
                makeSale();
                break;


        }

    }

    public static void addCar() {

        Scanner input = new Scanner(System.in);

        // variables to be used for object creation

        String vinInput;
        String makeInput;
        String modelInput;
        double yearInput;
        double mileageInput;
        double priceInput;
        int backToMenu = 0;

        //assign values to the variables based on input from user

        System.out.println("enter a vin");
        vinInput = input.next();

        System.out.println("enter a make");
        makeInput = input.next();

        System.out.println("enter a model");
        modelInput = input.next();

        System.out.println("enter a year");
        yearInput = input.nextDouble();

        System.out.println("enter a mileage");
        mileageInput = input.nextDouble();

        System.out.println("enter a price");
        priceInput = input.nextDouble();


        // create object and pass in the variables
        // add the object to the array of objects

        carsArray[objectCounter] = new Car(vinInput, makeInput, modelInput, yearInput, mileageInput, priceInput);

        objectCounter++;

        System.out.println("New car created.");
        System.out.println("Press 1 to return to menu:");
        backToMenu = input.nextInt();



        if (backToMenu == 1) {

            menu();

        }

    }


    public static void makeChange() {

        Scanner input = new Scanner(System.in);
        int counter = 0;
        int carChoice = 0;
        int componentChoice = 0;
        double valueDouble = 0.0;
        String valueString = "0";
        int backToMenu = 0;

        for (int j = 0; j < objectCounter; j++) {

            System.out.println(carsArray[j].getVin());

        }

        System.out.println("which do you want to edit? enter number 0 to " + carsArray.length);
        carChoice = input.nextInt();

        System.out.println("Which component do you wish to edit? (1 for vin, 2 for make, 3 for model, 4 for year, 5 for mileage, 6 for price)");
        componentChoice = input.nextInt();

        System.out.println("Input the value");

        if (componentChoice == 1) {

            valueString = input.next();

            carsArray[carChoice].setVin(valueString);

        }

        else if (componentChoice == 2) {

            valueString = input.next();

            carsArray[carChoice].setMake(valueString);

        }

        else if (componentChoice == 3) {

            valueString = input.next();

            carsArray[carChoice].setModel(valueString);

        }

        else if (componentChoice == 4) {

            valueDouble = input.nextDouble();

            carsArray[carChoice].setYear(valueDouble);

        }

        else if (componentChoice == 5) {

            valueDouble = input.nextDouble();

            carsArray[carChoice].setMileage(valueDouble);

        }

        else if (componentChoice == 6) {

            valueDouble = input.nextDouble();

            carsArray[carChoice].setPrice(valueDouble);

        }

        else {System.out.println("Invalid component choice");}

        System.out.println("Complete!");
        System.out.println("Press 1 to return to menu:");
        backToMenu = input.nextInt();

        if (backToMenu == 1) {

            menu();

        }

    }

    public static void viewInfoAll() {

        Scanner input = new Scanner(System.in);

        int backToMenu = 0;

        for (int j = 0; j < objectCounter; j++) {

            System.out.println("Car " + j + " info: ");
            System.out.println();
            System.out.print(carsArray[j].printCar());
            System.out.println();

        }

        System.out.println("Press 1 to return to menu:");
        backToMenu = input.nextInt();


        if (backToMenu == 1) {

            menu();

        }


    }


    public static void viewInfoCar() {

        int userSelection = 0;
        int backToMenu = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Which car would you like to view? (please enter number 0 to 20): ");
        userSelection = input.nextInt();

        System.out.println(carsArray[userSelection].printCar());

        System.out.println("Press 1 to return to menu:");
        backToMenu = input.nextInt();

        if (backToMenu == 1) {

            menu();

        }



    }

    public static void viewAvgMilesAll() {

        Scanner input = new Scanner(System.in);

        double sum = 0;
        double average = 0;
        int backToMenu = 0;

        for (int j = 0; j < objectCounter; j++) {

            sum += carsArray[j].getMileage();

            average = sum/objectCounter;

        }

        System.out.println("The average is " + average);
        System.out.println();
        System.out.println("Press 1 to return to menu:");

        backToMenu = input.nextInt();

        if (backToMenu == 1) {

            menu();

        }


    }


    public static void viewLowestPriceAll() {

        Scanner input = new Scanner(System.in);
        int backToMenu = 0;

        ArrayList<Double> prices = new ArrayList<Double>();
        double lowestPrice;

        for (int j = 0; j < objectCounter; j++) {

            prices.add(carsArray[j].getPrice());

        }

        lowestPrice = Collections.min(prices);

        System.out.print(lowestPrice);

        System.out.println("Press 1 to return to menu:");
        backToMenu = input.nextInt();

        if (backToMenu == 1) {

            menu();

        }

    }

    public static void makeSale() {

        Scanner input = new Scanner(System.in);
        int saleChoice = 0;
        int carChoice = 0;
        double discountedPrice = 0.0;
        int backToMenu = 0;

        System.out.println("Please select a car: (enter a number 0 through 20)");
        carChoice = input.nextInt();

        System.out.println("Enter customer disposition:");
        System.out.println(" Press 1 for \"Very Interested\": ");
        System.out.println(" Press 2 for \"Somewhat Interested\": ");
        System.out.println(" Press 3 for \"Not Very Interested\": ");

        saleChoice = input.nextInt();

        if (saleChoice == 1) {


            discountedPrice = carsArray[carChoice].getPrice() - 100;

            System.out.println("The price for " + carsArray[carChoice].getMake() + carsArray[carChoice].getModel() + " is " + carsArray[carChoice].getPrice());
            System.out.println("You qualify for a $100 discount. Buy this car now for: " + discountedPrice);

        }

        else if (saleChoice == 2) {


            discountedPrice = carsArray[carChoice].getPrice() - 200;

            System.out.println("The price for " + carsArray[carChoice].getMake() + carsArray[carChoice].getModel() + " is " + carsArray[carChoice].getPrice());
            System.out.println("You qualify for a $200 discount. Buy this car now for: " + discountedPrice);

        }

        else if (saleChoice == 3) {


            discountedPrice = carsArray[carChoice].getPrice() - 500;

            System.out.println("The price for " + carsArray[carChoice].getMake() + carsArray[carChoice].getModel() + " is " + carsArray[carChoice].getPrice());
            System.out.println("You qualify for a $500 discount. Buy this car now for: " + discountedPrice);

        }


        System.out.println("Press 1 to return to menu:");
        backToMenu = input.nextInt();

        if (backToMenu == 1) {

            menu();

        }


    }

}


