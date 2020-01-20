// GradeBook class using an array to store test grades
// video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson07_11
public class GradeBook {

    private String courseName;
    private int[] grades;

    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

    public void processGrades() {
        outGrades();

        System.out.printf("%nClass average is %.2f%n", getAverage());
        System.out.printf("lowest grade is %d%nhighest grade is %d%n", getMin(), getMax());

        outputBarChart();
    }

    private void outputBarChart() {
        System.out.println("grade distribution");

        int[] frequency = new int[11];

        for (int grade : grades) {
            ++frequency[grade/10];
        }

        for (int i = 0; i < frequency.length; i++) {
            if (i==10) {
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ", i*10, i*10+9);
            }

            for (int j = 0; j < frequency[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private int getMax() {
        int max = grades[0];

        for (int grade: grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    private int getMin() {
        int low = grades[0];

        for (int grade: grades){
            if (grade < low) {
                low = grade;
            }
        }

        return low;
    }

    private double getAverage() {
        int total = 0; 
        for (int grade: grades){
            total += grade;
        }
        return (double)total / grades.length;
    }

    private void outGrades() {
        System.out.printf("the grades are:%n%n");

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %2d: %3d%n", i+1, grades[i]);
        }
    }
}