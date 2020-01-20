// Poll analysis program
// video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson07_07
public class StudentPoll {

    public static void main(String[] args) {
        int[] responses = {1,2,3,4,5,3,2,6,8,2,5,7};
        int[] freq = new int[6];

        for (int i = 0; i < responses.length; i++) {
            try {
                ++freq[responses[i]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf(" responses[%d] = %d%n%n", i, responses[i]);
            }
        }

        System.out.printf("%s%10s%n", "rating", "frequency");

        for (int i = 1; i < freq.length; i++) {
            System.out.printf("%6d%10d%n", i, freq[i]);
        }
    }
}