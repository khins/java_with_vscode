/**
 * Package access members of a class are accessible by other classes in the same package
 * video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson08_10
 */
public class PackageDataTest {

    // Package access members of a class are accessible by other classes in the same package
    public static void main(String[] args) {
        PackageData packageData = new PackageData();
        System.out.printf("after new: %n%s%n", packageData);
        packageData.number = 77;
        packageData.string = "new test";
        System.out.printf("after change: %n%s%n", packageData);

    }
}

class PackageData {
    int number; 
    String string;

    public PackageData() {
        number = 0; 
        string = "test";
    }

    public String toString() {
        return String.format("number: %d; string %s", number, string);
    }
}