package ie.atu.OOP.demo;

public class MainTicket {
    public static void main(String[] args) {
        Ticket standard = new Ticket("Summer Concert","Alice",50.00);
        Ticket StudentTicket = new StudentTicket("Summer Concert","Bob",50.00,"S12345");
        Ticket VIPTicket = new VIPTicket("Summer Concert","Charlie",50.00);

        System.out.println("Event: " + standard.geteventName());
        System.out.println("Standard Ticket - " + standard.getholderName() + ": €" + String.format("%.2f",standard.getcalculatePrice()));
        System.out.println("Student Ticket  - " + StudentTicket.getholderName() + ": €" + String.format("%.2f",StudentTicket.getcalculatePrice()));
        System.out.println("VIP Ticket      - " + VIPTicket.getholderName() + ": €" + String.format("%.2f",VIPTicket.getcalculatePrice()));

        System.out.println("Student ID: "+ ((StudentTicket) StudentTicket).getstudentId());
        System.out.println("Benefits: " + ((VIPTicket) VIPTicket).getBenefits());

    }
}
