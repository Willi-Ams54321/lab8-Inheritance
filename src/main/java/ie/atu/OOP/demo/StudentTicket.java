package ie.atu.OOP.demo;

public class StudentTicket extends Ticket {
    private String studentId;

    public StudentTicket(String eventName, String holderName, double basePrice, String studentId)
    {
        super(eventName, holderName, basePrice);
        this.studentId = studentId;
    }

    public String getstudentId()
    {
        return studentId;
    }

    @Override
    public double getcalculatePrice()
    {
        double price =super.getcalculatePrice();
        return price*.8;
    }
}

