import java.math.BigDecimal;
import java.text.NumberFormat;
// updated to use Compound-interest calculations with BigDecimal
// in video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson08_11
// Compound-interest calculations with for
public class Interest {

    public static void main(final String[] args) {
        // double amount;
        // double principal = 1000;
        // double rate = 0.05;
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <=10; year++) {
            // amount = principal * Math.pow(1.0 + rate, year);
            // System.out.printf("%4d%,20.2f%n", year,amount);
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        }
    }
}