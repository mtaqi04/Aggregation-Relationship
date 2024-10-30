public class Student {
    private final int id;
    private int semester;
    private double average;
    private final Person personData;

    // Constructor
    public Student(int id, int semester, double average, Person personData) {
        this.id = id;
        this.semester = semester;
        this.average = average;
        this.personData = personData;
    }

    // Getter methods
    public int getId() { return id; }
    public int getSemester() { return semester; }
    public double getAverage() { return average; }
    public Person getPersonData() { return personData; }

    // Setter methods
    public void setSemester(int semester) { this.semester = semester; }
    public void setAverage(double average) { this.average = average; }

    // Get year method
    public int getYear() {
        return (semester + 1) / 2;
    }

    // Check average method
    public boolean checkAverage(double value) {
        return average > value;
    }

    // Display method
    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Semester: " + semester);
        System.out.println("Average: " + average);
        System.out.println("Year of Study: " + getYear());
        personData.display();
    }
}
