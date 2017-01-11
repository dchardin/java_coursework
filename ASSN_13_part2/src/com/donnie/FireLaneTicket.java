package com.donnie;

/**
 * Created by donnie on 11/29/16.
 */
public class FireLaneTicket extends Ticket {

    private double charge;

    public FireLaneTicket(String tag, String make, String model, String color) {
        super(tag, make, model, color);
        this.charge = 150.00;
    }

    public double getCharge() {
        return charge;
    }

    @Override
    public String printTicket() {


        return "Firelane parking violation. Tag is: "
                + getTag() + " Make: " + getMake() + " Model: "
                + getModel() + " Color: " + getColor() + " Fee: "
                + getCharge() ;

    }

}
