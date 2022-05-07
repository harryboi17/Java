package BASICS;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Gregorian_calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MINUTE));

        GregorianCalendar greg = new GregorianCalendar();
        System.out.println(greg.isLeapYear(2020));

        /*
        4 classes:
        LocalDate, LocalTime, LocalDateTime, DateTimeFormatter
         */
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime t = LocalTime.now();
        System.out.println(t);


        LocalDateTime dt = LocalDateTime.now();
//        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-mm-yyyy");
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd LLLL yyyy, EEEE h:m:s a");
        //go to java 14 Docs to get more symbols
        //E represets Day, using 4 E's gives full form of the day same goes with L
        System.out.println(dft);
        String MyDate = dt.format(dft);
        System.out.println(MyDate);


    }
}
