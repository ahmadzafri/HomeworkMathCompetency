import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //name, address, and principal name entry

        School school23 = new School("SK Strong");
        Address address23 = new Address("Strong Street", "97000", "Strong City", "Strong State");
        Principal principal23 = new Principal("Jeff", "Bezos");

        school23.setAddress(address23);
        school23.setPrincipal(principal23);

        System.out.println("School 23 Name\t\t\t: "
                + school23.getSchoolName());
        System.out.println("School 23 Address\t\t: "
                + school23.getAddress(address23.street)
                + ", " + school23.getAddress(address23.postcode)
                + ", " +school23.getAddress(address23.city)
                + ", " + school23.getAddress(address23.state));
        System.out.println("School 23 Principal\t\t: " + school23.getPrincipalName(principal23.fName)
                + " "
                + school23.getPrincipalName(principal23.lName));



        //marks entry

        Student student231 = new Student(80, "21000556", "Jack", "5 Biceps");
        Student student232 = new Student(70, "21000557", "Ma", "5 Triceps");

        school23.setStudent(student231);
        school23.setStudent(student232);


        System.out.println("\n\nSchool 23 Student 1 Mark: " + school23.getStudent(String.valueOf(student231.score)));
        System.out.println("School 23 Student 2 Mark: " + school23.getStudent(String.valueOf(student232.score)));



        //marks analysis

        Marks marks23 = new Marks(2);
        System.out.println("Average: ");
    }









}