package com.donnie;

/**
 * Created by donnie on 12/7/16.
 */
public class Car {

    private String vin;
    private String make;
    private String model;
    private double year;
    private double mileage;
    private double price;

    public Car(String vin, String make, String model, double year, double mileage, double price) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }


    public String printCar() {

//    return "Vin is: " + getVin() + " Make is: " + getMake() + " Model is: " + getModel() + " Year is: " + getYear() + " Mileage is: " + getMileage() + " Price is: " + getPrice();

    return String.format(" Vin is: %s\n Make is: %s\n Model is: %s\n Year is: %.1f\n Mileage is: %.1f\n Price is: %.2f\n", getVin(),getMake(),getModel(),getYear(),getMileage(),getPrice());


    }


    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {

        if (year > 1970) {

            this.year = year;

        } else {

            this.year = 1970;

        }
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {

        if (mileage > 0.0) {

            this.mileage = mileage;

        }

        else {

            this.mileage = 0.0;

        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price > 1000) {

            this.price = price;

        }

        else {

            this.price = 1000;

        }
    }
}
