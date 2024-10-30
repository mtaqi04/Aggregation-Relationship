public class Address {
    private String city;
    private String street;
    private String number;
    private String postalCode;

    // Constructor
    public Address(String city, String street, String number, String postalCode) {
        this.city = city;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
    }

    // Getter methods
    public String getCity() { return city; }
    public String getStreet() { return street; }
    public String getNumber() { return number; }
    public String getPostalCode() { return postalCode; }

    // Setter methods
    public void setCity(String city) { this.city = city; }
    public void setStreet(String street) { this.street = street; }
    public void setNumber(String number) { this.number = number; }
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

    // Display method
    public void display() {
        System.out.println("Address: " + street + " " + number + ", " + city + ", " + postalCode);
    }
}
