package ie.atu.OOP.demo;

public class VIPTicket extends Ticket{

    public VIPTicket(String eventName, String holderNumber, double basePrice)
    {
        super(eventName, holderNumber, basePrice);
    }

    @Override
    public double getcalculatePrice() {
        double price=super.getcalculatePrice();
        return price+25;
    }
    public void getBenefits(){
        System.out.println("Priority entry and reserved seating");
    }
}
