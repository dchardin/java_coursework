package com.donnie;

public class HandicappedTicket extends Ticket {

    private double charge;

    public HandicappedTicket(String tag, String make, String model, String color) {
        super(tag, make, model, color);
        this.charge = 100.00;
    }

    public double getCharge() {
        return charge;
    }

}
