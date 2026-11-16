package ie.atu.OOP.demo;

public class Ticket {
    private String eventName;
    private String holderName;
    private double basePrice;

    public Ticket( String eventName,String holderNumber, double basePrice){
        this.eventName = eventName;
        this.holderName = holderName;
        this.basePrice = basePrice;
    }

    public String getEventName() {
        return eventName;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getcalculatePrice() {
        return basePrice;
    }
    @Override
    public String toString()
    {
        return"Ticket{" + "eventName=" + eventName + ", holderName=" + holderName + '}';
    }

}

