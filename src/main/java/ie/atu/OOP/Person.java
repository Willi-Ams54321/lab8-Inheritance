package ie.atu.OOP;

public class Person{
    private String name;
    private String phoneNumber;
    private String address;
public Person()
{
    this("","","");
}

    public Person(String name,String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}
 @Override
    public String toString() {
     return "Person{name='" + name + "', address='" + address +
             "', phoneNumber='" + phoneNumber + "'}";
 }

}