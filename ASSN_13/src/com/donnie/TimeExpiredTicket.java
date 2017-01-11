package com.donnie;

public class TimeExpiredTicket extends Ticket {

    private double charge;

    public TimeExpiredTicket(String tag, String make, String model, String color) {
        super(tag, make, model, color);
        this.charge = 50.00;
    }

    public double getCharge() {
        return charge;
    }

}

