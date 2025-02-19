package mywork;

public class Customer {
    String name;
    Double creditLimit;

    public Customer() {
        this("Vaishali","Kharadi");
    }

    public Customer(String name, String address) {
        this(name,9999d,address);
    }

    public Customer(String name, Double creditLimit, String address) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    String address;

}
