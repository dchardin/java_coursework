package com.donnie;

/**
 * Created by donnie on 11/29/16.
 */
public class HandicappedTicket extends Ticket {

    private double charge;

    public HandicappedTicket(String tag, String make, String model, String color) {
        super(tag, make, model, color);
        this.charge = 100.00;
    }

    public double getCharge() {
        return charge;
    }

    @Override
    public String printTicket() {


        return "handicapped parking violation. Tag is: "
                + getTag() + " Make: " + getMake() + " Model: "
                + getModel() + " Color: " + getColor() + " Fee: "
                + getCharge() ;


    }

}
