// Calculating the values to be placed into the elements of an array
public class InitArray {

    public static void main(String[] args) {
        final int Array_Length = 100;
        int[] array = new int[Array_Length];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = 2+2*i;
        }
        System.out.printf("%s%8s%n", "index", "value");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d%n", i, array[i]);
        }
    }
}