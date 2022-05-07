package BASICS;

import java.util.Locale;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        /*
        String a = s.toLowerCase(Locale.ROOT); //convert all letters to lower case
        String b = s.toUpperCase(Locale.ROOT);
        System.out.println(a);
        System.out.println(b);
        */
        /*
        String s2 = scn.nextLine();
        System.out.println(s2);
        String c = s2.trim(); // removes all leading spaces
        System.out.println(c);
        */


        System.out.println(s.substring(2,3)); //start idx is included, but end is not
        System.out.println(s.replace('r','s'));
        System.out.println(s.replace("har", "van"));

        System.out.println(s.startsWith("shit"));
        System.out.println(s.startsWith("har"));
        System.out.println(s.endsWith("shit"));


    }
}
