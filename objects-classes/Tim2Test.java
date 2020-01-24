/**
 * c:\Users\kevin\Documents\Learning Library\Java\java_with_vscode\bin>java -classpath "C:\Users\kevin\Documents\Learning Library\Java\java_with_vscode\bin" Tim2Test
Constructed with:
t1: all default args
 00:00:00
 12:00:00 AM
 t2:
 02:00:00
 02:00:00 AM
 t3:
 21:34:00
 09:34:00 PM
 t4:
 12:35:42
 12:35:42 PM
 t5:
 12:35:42
 12:35:42 PM

Exception occured in t6: hour must be 0-23
 */
public class Tim2Test {

    public static void main(String[] args) {
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21, 34);
        Time2 t4 = new Time2(12, 35, 42);
        Time2 t5 = new Time2(t4);

        System.out.println("Constructed with: ");
        displayTime("t1: all default args", t1);
        displayTime("t2: ", t2);
        displayTime("t3: ", t3);
        displayTime("t4: ", t4);
        displayTime("t5: ", t5);

        try {
            Time2 t6 = new Time2(27,74,99);

        } catch (IllegalArgumentException e) {
            System.out.printf("%nException occured in t6: %s%n", e.getMessage());
        }
    }

    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n %s%n %s%n ", header, t.toUniversalString(), t.toString());
    }
}