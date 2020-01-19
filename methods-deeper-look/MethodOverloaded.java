// Overloaded method declarations
public class MethodOverloaded {

    public static void main(String[] args) {
        System.out.printf("square of integer 7 is %d%n", square(7));
        System.out.printf("square of integer 7.5 is %f%n", square(7.5));

    }

    private static Object square(double d) {
        System.out.printf("%ncalled square with int argument", d);
        return d * d;
    }

    private static Object square(int i) {
        System.out.printf("%ncalled square with int argument", i);
        return i * i;
    }
}