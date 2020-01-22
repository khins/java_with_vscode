import java.util.Arrays;
// Arrays class methods and System.arraycopy
// video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson07_16
/*
c:\Users\kevin\Documents\Learning Library\Java\java_with_vscode\bin>java 
            -classpath "C:\Users\kevin\Documents\Learning Library\Java\java_with_vscode\bin" ArrayManipulations

DoubleArray: 0.23.47.98.49.3
filledInArray: 7 7 7 7 7 7 7 7 7 7
intArray: 1 2 3 4 5 6
intArrayCopy: 1 2 3 4 5 6

intArray == intArrayCopy
found 5 at element 4 in intArray
8763 not found in intArray
*/
public class ArrayManipulations {

    public static void main(String[] args) {
        double[] doubleArray = {8.4,9.3,0.2,7.9,3.4};
        Arrays.sort(doubleArray);
        System.out.printf("%nDoubleArray: ");

        for (double value : doubleArray) {
            System.out.printf("%.1f", value);
        }

        int[] filledInArray = new int[10];
        Arrays.fill(filledInArray,7);
        displayArray(filledInArray, "filledInArray");

        int[] intArray = {1,2,3,4,5,6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        // comparing arrays
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n", (b ? "==" : "!="));

        // searching arrays
        int location = Arrays.binarySearch(intArray, 5);

        if (location >= 0) {
            System.out.printf("found 5 at element %d in intArray%n", location);
        }else{
            System.out.println("5 not found in intArray");
        }

        location = Arrays.binarySearch(intArray, 8763);

        if (location >= 0) {
            System.out.printf("found 8763 at element %d in intArray", location);
        } else {
            System.out.println("8763 not found in intArray");
        }

    }

    private static void displayArray(int[] array, String description) {
        System.out.printf("%n%s: ", description);

        for (int value : array) {
            System.out.printf("%d ", value);
        }
    }
}