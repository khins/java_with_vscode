import java.util.EnumSet;
/**
 * Declaring an enum type with a constructor and explicit instance fields and accessors for these fields
 * video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson08_06?autoplay=false
 * c:\Users\kevin\Documents\Learning Library\Java\java_with_vscode\bin>java -classpath "C:\Users\kevin\Documents\Learning Library\Java\java_with_vscode\bin" EnumTest
All books:
TEST      test                                         value1
TEST2     test                                          value 2

Display a range of constants:
TEST      test                                         value1
TEST2     test                                          value 2
 */
public class EnumTest {

    public static void main(String[] args) {
        System.out.println("All books: ");

        for (Book book : Book.values()) {
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getValue());
        }

        System.out.printf("%nDisplay a range of constants:%n");

        for (Book book: EnumSet.range(Book.TEST, Book.TEST2)) {
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getValue());
        }
    }
}