import java.util.List;

public class School {



    public static void main(String[]args) {
        NonTeachingStaff lizzy = new NonTeachingStaff("Elizabeth","Mark","Supervisor",700.00);
        NonTeachingStaff ment = new NonTeachingStaff("James","Stones","Security",200.00);
        NonTeachingStaff Steph = new NonTeachingStaff("Steph","Curry","cleaner",200.00);

       /** NonTeachingStaff[] nonTeachingStaffs = new NonTeachingStaff[3];
        nonTeachingStaffs[3] = new NonTeachingStaff();
        nonTeachingStaffs[3].
        */

        /**List<NonTeachingStaff> nonTeacherList= new ArrayList<NonTeachingStaff>();
        nonTeacherList.add(lizzy);
        nonTeacherList.add(ment);
        nonTeacherList.add(Steph);

         */

        ment.getFirstName();
        ment.getLastNameName();
        ment.getRoleTaking();
        ment.getSalary();
        ment.getID();

        lizzy.getFirstName();
        lizzy.getLastNameName();
        lizzy.getRoleTaking();
        lizzy.getSalary();
        lizzy.getID();

        Steph.getFirstName();
        Steph.getLastNameName();
        Steph.getRoleTaking();
        Steph.getSalary();
        Steph.getID();


        Teachers pete = new Teachers("Peter", "Paul", "History101", 500.00);
        Teachers stone = new Teachers("John", "Stones", "PHE101", 500.00);
        Teachers water = new Teachers("Daniel", "Drinkwater", "English101", 500.00);

       /** List<Teachers> teacherList= new ArrayList<Teachers>();
        teacherList.add(pete);
        teacherList.add(stone);
        teacherList.add(water);
        */

        pete.getFirstName();
        pete.getLastNameName();
        pete.getCourse();
        pete.getSalary();
        pete.getID();

        stone.getFirstName();
        stone.getLastNameName();
        stone.getCourse();
        stone.getSalary();
        stone.getID();

        water.getFirstName();
        water.getLastNameName();
        water.getCourse();
        water.getSalary();
        water.getID();



        Student jones = new Student("John", "Small", "Jss1", 2000.00);
        Student smith = new Student("Victor", "Smith", "Jss2", 2000.00);
        Student Scott = new Student("Scott", "Ademi", "ss1", 2000.00);

        /**List<Student> StudentList= new ArrayList<Student>();
        StudentList.add(jones);
        StudentList.add(smith);
        StudentList.add(Scott);
         */


        jones.getFirstName();
        jones.getLastNameName();
        jones.getGradeYear();
        jones.getPaidFees();
        jones.getID();

        smith.getFirstName();
        smith.getLastNameName();
        smith.getGradeYear();
        smith.getPaidFees();
        smith.getID();

        Scott.getFirstName();
        Scott.getLastNameName();
        Scott.getGradeYear();
        Scott.getPaidFees();
        Scott.getID();


        jones.admission();
        jones.suspension();

        smith.admission();
        smith.suspension();

        Scott.admission();
        Scott.suspension();
    }
}
