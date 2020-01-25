/**
 * Composition demonstration with classes Date and Employee
 * c:\Users\kevin\Documents\Learning Library\Java\java_with_vscode\bin>java -classpath "C:\Users\kevin\Documents\Learning Library\Java\java_with_vscode\bin" EmployeeTest
date object constructor for date 7241946
date object constructor for date 4131986
Mi, Bob Hired: 4131986  birthday: 7241946
 */
public class EmployeeTest {

    public static void main(String[] args) {
        Date birth = new Date(7, 24, 1946);


        Employee employee = new Employee("Bob", "Mi", birth, new Date(4, 13, 1986));
        System.out.println(employee);
    }
}