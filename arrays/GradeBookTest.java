public class GradeBookTest {

    public static void main(String[] args) {
        int[] grades = {87,68,94,100,83,78,85,91,76,87};
        GradeBook mygGradeBook = new GradeBook("programming", grades);
        mygGradeBook.processGrades();
    }
}