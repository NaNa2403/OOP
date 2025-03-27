package lab7.ex1_4;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        if (hour > 23 || minute > 59 || second > 59 || hour < 0 || minute < 0 || second < 0) {
            throw new IllegalArgumentException();
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if (hour > 23 || minute > 59 || second > 59 || hour < 0 || minute < 0 || second < 0) {
            throw new IllegalArgumentException();
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 23 || hour < 0) {
            throw new IllegalArgumentException();
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 59 || minute < 0) {
            throw new IllegalArgumentException();
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > 59 || second < 0) {
            throw new IllegalArgumentException();
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public MyTime nextSecond() {
        this.second++;
        if (this.second > 59) {
            this.second = 0;
            nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        this.minute++;
        if (this.minute > 59) {
            this.minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        this.hour++;
        if (this.hour > 23) {
            this.hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        this.second--;
        if (this.second < 0) {
            this.second = 59;
            previousMinute();
        }
        return this;
    }

    public MyTime previousMinute(){
        this.minute--;
        if (this.minute < 0) {
            this.minute = 59;
            previousHour();
        }
        return this;
    }

    public MyTime previousHour(){
        this.hour--;
        if (this.hour < 0) {
            this.hour = 23;
        }
        return this;
    }
}
