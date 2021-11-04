package datesAndCalenders;
import java.util.*;



public class DatesAndCalenders {
    public static void  main(String[] args){
        DatesAndCalenders.displayCurrentDate();
        DatesAndCalenders.displaySetDate();

    }
    public static void displayCurrentDate(){
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        Date date = new java.util.Date();
        c.setTime(date);
        System.out.println(c.getTime());
    }
    public static void displaySetDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2031,02,02);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
