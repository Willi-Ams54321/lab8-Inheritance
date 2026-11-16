package ie.atu.OOP;

public class CustomerTest {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer("Paul","54321","Gort",12345,true);
        System.out.println(firstCustomer);

        Customer secondCustomer = new Customer();
        secondCustomer.setName("Bob");
        secondCustomer.setPhoneNumber("54321");
        secondCustomer.setAddress("Bob Street");
        secondCustomer.setCustomerNumber(123);
        secondCustomer.setMailingList(false);
        System.out.println("");
        System.out.println(secondCustomer);

    }
}
