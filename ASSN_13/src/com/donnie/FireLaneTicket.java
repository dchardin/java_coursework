package com.donnie;

public class FireLaneTicket extends Ticket {

    private double charge;

    public FireLaneTicket(String tag, String make, String model, String color) {
        super(tag, make, model, color);
        this.charge = 150.00;
    }

    public double getCharge() {
        return charge;
    }

}

