public class Time {
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            this.setTime(hour, minute, second);
        } else {
            throw new IllegalArgumentException("Format is hour[0,23] minute[0,59] second[0,59]");
        }
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour =hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        String concatenatedTime = String.format("%02d", this.getHour() + ":" + String.format("%02d", this.getMinute()) + ":" + String.format("%02d", this.getSecond()));
        return concatenatedTime;
    }
    public Time nextSecond() {
        this.second = this.second +1;
        return this;
    }
    public Time previousSecond() {
        this.second = this.second - 1;
        return this;
    }

}
