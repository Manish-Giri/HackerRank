package tutorials.thirtydaysofcode;

/**
 * Created by manishgiri on 1/11/17.
 */
public class InheritancePerson {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    InheritancePerson(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }
}
