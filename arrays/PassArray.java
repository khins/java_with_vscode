// Passing arrays and individual array elements to methods
// video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson07_10
public class PassArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        System.out.printf("pass ref: %n" + "values of original array are:%n");

        for (int value: array) {
            System.out.printf("   %d", value);
        }

            modifyArray(array);
            System.out.printf("%n%nthe values of the modified array are:%n");

        for (int value: array) {
            System.out.printf("   %d", value);
        }

        System.out.printf("%n%neffects of passing array element value before modifyElements:%n", array[3]);

        modifyElement(array[3]);
        System.out.printf("%n%narray[3]s value after modifyElement :%d%n", array[3]);

        
        
    }

    private static void modifyElement(int element) {
        element *=2;
        System.out.printf("value of element in modifyElement: %d%n", element);
    }

    private static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }
}