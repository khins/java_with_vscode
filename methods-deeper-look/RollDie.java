import java.security.SecureRandom;
// Roll a six-sided die 6,000,000 times
// now Die-rolling program using arrays instead of switch
// video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson07_06
public class RollDie {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];

        for (int i = 1; i <= 6000000; i++) {
            ++frequency[1+random.nextInt(6)];
        }

        System.out.println("Face\tFrequency");

        for (int i = 0; i < frequency.length; i++) {
            System.out.printf("%4d%10d%n", i, frequency[i]);
        }
    }
}