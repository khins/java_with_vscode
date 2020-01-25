/**
 * Composition demonstration with classes Date and Employee
 * c:\Users\kevin\Documents\Learning Library\Java\java_with_vscode\bin>java -classpath "C:\Users\kevin\Documents\Learning Library\Java\java_with_vscode\bin" EmployeeTest
date object constructor for date 7241946
date object constructor for date 4131986
Mi, Bob Hired: 4131986  birthday: 7241946
 */
public class EmployeeTest {

    public static void main(String[] args) {
        // Date birth = new Date(7, 24, 1946);
        // Employee employee = new Employee("Bob", "Mi", birth, new Date(4, 13, 1986));
        // System.out.println(employee);

        System.out.printf("Emps before new: %d%n", Employee.getCount());

        Employee e1 = new Employee("Roger", "Waters");
        Employee e2 = new Employee("Nick", "Mason");

        System.out.printf("%nEmps after new:%n");
        System.out.printf("e1.count = %d%n", e1.getCount());
        System.out.printf("e2.count = %d%n", e2.getCount());
        System.out.printf("Employee.count = %d%n", Employee.getCount());

    }
}