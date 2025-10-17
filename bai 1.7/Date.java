import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    int day;
    int month;
    int year;
    Date(int day, int month, int year) {
        if(day >1 && 31< day && month>1 && month<12 && year>1900 && year<9999) {
            this.setDate(day, month, year);
        }else {
            throw new IllegalArgumentException("Number between the rangers of Day[1,31] Month[1,12] Year[1900,9999]");
        }
    }
    public int  getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatted =String.format("%02d", this.getDay() +"." + this.getMonth() +"."+ this.getYear());
        return formatted;

    }
}
