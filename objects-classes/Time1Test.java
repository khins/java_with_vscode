/**
 * the time tester class
 */
public class Time1Test {

    public static void main(final String[] args) {
        final Time1 time = new Time1();
        displayTime("After object is created", time);
        System.out.println();
        
        time.setTime(13,27,6);
        displayTime("After calling setTime", time);
        System.out.println();

        try {
            time.setTime(99,99,99);
        } catch (final IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        displayTime("Afer calling setTime with invalid args", time);
    }

    public static void displayTime(final String header, final Time1 t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n"
        , header, t.toUniversalString(), t.toString());
    }
}