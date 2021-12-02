import java.util.Random;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int ID; // don't forget to input it
    private double paidFees;
    private String gradeYear;
    private int grade;
    private int age;
    private int continuousAssessment;
    private String behaviour;




    public Student(String firstName, String lastName, String gradeYear, double paidFees) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.gradeYear=gradeYear;
        this.paidFees=paidFees;

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
    public String getGradeYear() {
        return this.gradeYear;
    }
    public double getPaidFees() {
        return this.paidFees;
    }

    public void admission() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your your Age: ");
        int age = input.nextInt();

        System.out.print("Enter your your Grade: ");
        int grade = input.nextInt();
        if ((grade>=60)&&(age>=11)) {
            System.out.println("Admitted");
        }
        else {
            System.out.println("Rejected");
        }
    }
    public void suspension() {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter your your Continuous Assessment: ");
        int continuousAssessment = input.nextInt();

        System.out.print("Enter Behaviour comment(GOOD OR POOR = 11 ): ");
        int behaviour = input.nextInt();

        if ((continuousAssessment<=60)||(behaviour==11)) {
            System.out.println("suspended");
        }
    }

}
