package Gaara;

public class Date2 {
    private int day;
    private int month;
    private int year;
    public Date2(int newDay, int newMonth, int newYear){
        day=newDay;
        month=newMonth;
        year=newYear;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int Day){
        day=Day;
    }
    public void setMonth(int Month){
        month=Month;
    }
    public void setYear(int Year){
        year=Year;
    }
    public void setDate(int Day, int Month, int Year){
        day=Day;
        month=Month;
        year=Year;
    }
    public String toString(){
        return day+"/"+month+"/"+year;
    }

}
