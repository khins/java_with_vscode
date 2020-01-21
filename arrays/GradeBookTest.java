// GradeBook class using a two-dimensional array to store grades
// updated to : https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson07_13
public class GradeBookTest {

    public static void main(String[] args) {

        int[][] grades = {{87,96,70},
                          {100,73,82}};

        GradeBook mygGradeBook = new GradeBook("programming", grades);
        mygGradeBook.getCourseName();
        mygGradeBook.processGrades();
    }
}