/**
 * Declaring and using static variables and methods to maintain a count of the number of Employee objects in memory
 * video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson08_08
 */
public class Employee {

    private static int count = 0; 
    private String firstName; 
    private String lastName; 
    private Date birthDate; 
    private Date hireDate;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName; 
        ++count; 

        System.out.printf("emp ctor: %s %s; count = %d%n", firstName, lastName, count);
    }

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName; 
        this.hireDate = hireDate;
    }

    public String toString() {
        return String.format("%s, %s Hired: %s  birthday: %s", lastName, firstName, hireDate, birthDate);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getCount() {
        return count;
    }
}