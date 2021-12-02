import java.util.Random;

public class Teachers {
    private String firstName;
    private String lastName;
    private int ID; // don't forget to input it
    private double salary;
    private String course;

    public Teachers(String firstName, String lastName, String course, double salary) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.course=course;
        this.salary=salary;

        setID();
    }
    //Generate an ID.
    private void  setID(){
        Random randomNumbers = new Random(1000);
        this.ID = randomNumbers.nextInt();
    }

    public int getID() {
        return this.ID;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastNameName() {
        return this.lastName;
    }
    public String getCourse() {
        return this.course;
    }

    public double getSalary() {
        return this.salary;
    }
}
