//Initializing two-dimensional arrays 
// video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson07_12
public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] array1 = {{1,2,3},{4,5,6}};
        int[][] array2 = {{1,2},{3},{4,5,6}};

        System.out.printf("values in array1");
        outputArray(array1);

        System.out.printf("%nvalues in array2 by row are%n");
        outputArray(array2);

    }

    private static void outputArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }
}