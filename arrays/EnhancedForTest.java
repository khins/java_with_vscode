// Using the enhanced for statement to total integers in an array
// video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson07_09
public class EnhancedForTest {
    public static void main(String[] args) {
        int[] array = {87,68,94,100,83,78,85,91,76,87};
        int total = 0;
        
        // this is the enhanced for statement 
        for (int number : array) {
            total += number;
        }
        System.out.printf("total of array elements %d%n", total);
    }
    
}