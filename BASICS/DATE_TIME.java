package BASICS;

import java.util.Date;

/*
Date in java is stored in the form of a long integer , this long number holds
the number of milliseconds passed since 1 Jan 1970

Java assumed that 1900 is the start year which means it calculates year passed since
1900 whenever we ask for years passed
*/
public class DATE_TIME {
    public static void main(String[] args) {

       long second =  System.currentTimeMillis();
        System.out.println(second/1000);
        System.out.println(second/1000/60);
        System.out.println(second/1000/60/60);
        System.out.println(second/1000/60/60/24);
        System.out.println(second/1000/60/60/24/365);

        Date d = new Date();
        System.out.println(d);
    }
}
