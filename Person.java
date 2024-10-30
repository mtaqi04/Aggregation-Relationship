public class Person {
    private String name;
    private String surname;
    private final int yearOfBirth;
    private Address address;

    // Constructor
    public Person(String name, String surname, int yearOfBirth, Address address) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }

    // Getter methods
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getYearOfBirth() { return yearOfBirth; }
    public Address getAddress() { return address; }

    // Setter methods
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setAddress(Address address) { this.address = address; }

    // Get age method
    public int getAge() {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return currentYear - yearOfBirth;
    }

    // Is 18 method
    public boolean is18() {
        return getAge() >= 18;
    }

    // Change address method
    public void changeAddress(String city, String street, String number, String postalCode) {
        this.address = new Address(city, street, number, postalCode);
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Age: " + getAge());
        address.display();
    }
}
