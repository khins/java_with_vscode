// updated to Initializing an array using command-line arguments
// video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson07_15
// to run in cmd line I had to: 
/* 
c:\Users\kevin\Documents\Learning Library\Java\java_with_vscode>java  -Dfile.encoding=Cp1252 -classpath "C:\Users\kevin\Documents\Learning Library\Java\java_with_vscode\bin" InitArray 10 1 2"
index   value
    0       1
    1       3
    2       5
    3       7
    4       9
    5      11
    6      13
    7      15
    8      17
    9      19

*/
public class InitArray {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.printf("entire command%n" + "an array size and increment");
        }else {
            int arrayLen = Integer.parseInt(args[0]);
            int[] array = new int[arrayLen];

            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            for (int i = 0; i < array.length; i++) {
                array[i]=initialValue + increment * i;
            }
            System.out.printf("%s%8s%n", "index", "value");

            for (int i = 0; i < array.length; i++) {
                System.out.printf("%5d%8d%n", i, array[i]);

            }
        }


    }
}