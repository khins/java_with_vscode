// Using variable-length argument lists
// video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson07_14
public class Varargs {

    public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;

        System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n%n", d1,d2,d3,d4);
        System.out.printf("Average of d1 and d2 is %.1f%n", average(d1,d2));

    }

    private static double average(double... numbers) {
        double total = 0.0;
        for (double d : numbers) {
            total += d;
        }
        return total / numbers.length;
    }
}