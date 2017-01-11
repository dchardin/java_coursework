package com.donnie;

public class Main {

    public static void main(String[] args) {

        FireLaneTicket ticket1 = new FireLaneTicket("tes-6434", "Pontiac", "Firebird", "red");

        HandicappedTicket ticket2 = new HandicappedTicket("nfs-8645", "Jeep", "Wrangler", "white");

        TimeExpiredTicket ticket3 = new TimeExpiredTicket("ydx-3445", "Ford", "Ranger", "yellow");


        Ticket[] tickets = new Ticket[3];

        tickets[0] = ticket1;
        tickets[1] = ticket2;
        tickets[2] = ticket3;


        for (int j = 0; j < tickets.length; j++)
        System.out.printf("Ticket %d is a %s%n", j,
                tickets[j].printTicket());

    }
}
