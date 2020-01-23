/**
 * Time1 class declaration maintains the time in 24-hour format
 * video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson08_01
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