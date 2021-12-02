import java.util.Random;

public class NonTeachingStaff {
    private String firstName;
    private String lastName;
    private int ID; // don't forget to input it
    private double salary;
    private String roleTaking;

    //constructor; prompt user to enter their data.
    public NonTeachingStaff(String firstName, String lastName, String roleTaking, double salary) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.roleTaking=roleTaking;
        this.salary=salary;

        setID();
    }
    //Generate an ID.
    private void  setID() {
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
    public String getRoleTaking() {
        return this.roleTaking;
    }

    public double getSalary() {
        return this.salary;
    }

}
