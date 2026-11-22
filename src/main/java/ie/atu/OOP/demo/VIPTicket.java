package ie.atu.OOP.demo;

public class VIPTicket extends Ticket{

    private String benefits;

    public VIPTicket(String eventName, String holderName, double basePrice)
    {
        super(eventName, holderName, basePrice);
    }

      @Override
    public double getcalculatePrice() {
        double price=super.getcalculatePrice();
        return price+25;
    }

    public void getBenefits(String benefits) {
        System.out.println("Priority entry and reserved seating");
    }
}
