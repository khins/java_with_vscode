/**
 * Time1 class declaration maintains the time in 24-hour format
 * video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson08_01
 * c:\Users\kevin\Documents\Learning Library\Java\java_with_vscode\bin>java -classpath "C:\Users\kevin\Documents\Learning Library\Java\java_with_vscode\bin" Time1Test
After object is created
Universal time: 00:0000
Standard time: 12:0000 AM

After calling setTime
Universal time: 13:2706
Standard time: 01:2706 PM

Exception: value out of range

Afer calling setTime with invalid args
Universal time: 13:2706
Standard time: 01:2706 PM
 */
public class Time1 {

    private int hour;
    private int minute;
    private int second;

    public void setTime(final int hour, final int minute, final int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("value out of range");
        }

        this.hour = hour; 
        this.minute = minute;
        this.second = second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d%02d", hour,minute,second);
    }

    public String toString() {
        return String.format("%02d:%02d%02d %s", 
            ((hour == 0 || hour ==12) ? 12 : hour % 12), 
            minute,second, (hour < 12 ? "AM" : "PM"));
    }

}