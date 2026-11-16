package ie.atu.OOP.demo;

public class MainTicket {
    public static void main(String[] args) {
        Ticket standard = new Ticket("Summer Concert","Alice",50.00);
        Ticket StudentTicket = new StudentTicket("Summer Concert","Bob",50.00,"S12345");
        Ticket VIPTicket = new VIPTicket("Summer Concert","Charlie",50.00);
        System.out.println();

    }
}
