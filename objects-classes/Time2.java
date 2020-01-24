/**
 * Time2 class with overloaded constructors
 * video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson08_04
 */
public class Time2 {

    private int hour;
    private int minute;
    private int second;

    public Time2() {
        // invokes a constructor with 3 args
        this(0,0,0);
    }

    public Time2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-60");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-23");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time2(int hour) {
        this(hour,0,0);
    }

    public Time2(int hour, int minute) {
        this(hour,minute,0);
    }

    public Time2(Time2 time) {
      this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-60");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-23");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (hour < 0 || hour >= 60) {
            throw new IllegalArgumentException("minute must be 0-23");
        }

        this.minute = minute;
    }   
    
    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-23");
        }

        this.second = second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
    }

    public String toString() {
        return String.format("%02d:%02d:%02d %s", 
            ((getHour() == 0 || getHour() ==12) ? 12 : getHour() % 12), 
            getMinute(),getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }    

}
