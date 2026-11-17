package ie.atu.OOP.demo;

public class StudentTicket extends Ticket {
    private String studentId;

    public StudentTicket(String eventName, String holderNumber, double basePrice, String studentId)
    {
        super(eventName, holderNumber, basePrice);
        this.studentId = studentId;
    }

    public String getStudentId()
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

