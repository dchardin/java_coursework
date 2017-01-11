package com.donnie;

public class Main {

    public static void main(String[] args) {
	// write your code here


        FireLaneTicket ticket1 = new FireLaneTicket("tes-6434", "Pontiac", "Firebird", "red");

        HandicappedTicket ticket2 = new HandicappedTicket("nfs-8645", "Jeep", "Wrangler", "white");

        TimeExpiredTicket ticket3 = new TimeExpiredTicket("ydx-3445", "Ford", "Ranger", "yellow");

        System.out.println("");
        System.out.println("Ticket 1: Fire Lane Use Infraction.");
        System.out.println("Tag: " + ticket1.getTag() );
        System.out.println("Make: " + ticket1.getMake() );
        System.out.println("Model: " + ticket1.getModel() );
        System.out.println("Color: " + ticket1.getColor() );
        System.out.println("Fee: " + ticket1.getCharge() );


        System.out.println("");
        System.out.println("Ticket 2: Handicapped Space Use Infraction.");
        System.out.println("Tag: " + ticket2.getTag() );
        System.out.println("Make: " + ticket2.getMake() );
        System.out.println("Model: " + ticket2.getModel() );
        System.out.println("Color: " + ticket2.getColor() );
        System.out.println("Fee: " + ticket2.getCharge() );

        System.out.println("");
        System.out.println("Ticket 3: Time Expiration Infraction.");
        System.out.println("Tag: " + ticket3.getTag() );
        System.out.println("Make: " + ticket3.getMake() );
        System.out.println("Model: " + ticket3.getModel() );
        System.out.println("Color: " + ticket3.getColor() );
        System.out.println("Fee: " + ticket3.getCharge() );

    }
}
