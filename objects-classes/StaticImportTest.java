import static java.lang.Math.*;
/**
 * static import of Math class methods
 * video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson08_09
 */
public class StaticImportTest {

    public static void main(final String[] args) {
        // you should always access the static methods of a class fully qualified name
        System.out.printf("sqrt(900) = %.1f%n", sqrt(900.0)); // bad programming practices
        System.out.printf("ceil(-9.8) = %.1f%n", ceil(-9.8));

    }
}