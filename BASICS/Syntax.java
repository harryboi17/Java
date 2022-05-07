package BASICS;
import java.util.Scanner;
public class Syntax {
    void sum(int... x){
        int s = 0;
        for(int i : x){
            s = s+i;
        }
        System.out.println(s);
    }

    void argu(int a, String... s){ //var args should be the last parameter
        System.out.println(a);      // in overloading, var args gets least priority
        for(var i : s)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        //*******************GENERAL*******************
        System.out.println("Hello World");
        String Harry = "HB";
        System.out.println(Harry);

        //******************DATA TYPES***************8
        int a = 5;
        float b = 45.22f;
        System.out.println(a);
        System.out.println(b);

        boolean IsAdult = false;
        System.out.println(IsAdult);

        /*
        Java Data types:
            1. Primitive DataTypes : byte(1 Bytes) {-128 to 128}, short(2 bytes), int(4 bytes), long(8 Bytes)
                                     float(4 bytes), double(8 Bytes), boolean(1 bytes), char(2 bytes).
            2. NON - Primitive or Reference DataTypes :
        */

        //***********************CIN**********************
        Scanner scn = new Scanner(System.in);
        int n;
        n = scn.nextInt();
        scn.nextLine(); // required to use when u use nextLine function in upcoming functions
        System.out.flush();
        System.out.println("Your Input was " + n);
        System.out.println("Your Input was " + n);

        String s = scn.nextLine(); //Doesn't take in consideration spaces
        System.out.println(s);

        //**************************ARRAY************************
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
            System.out.println(arr[i]);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        //**************************2D ARRAY********************
        int[][] array = new int[5][8];
        array[1][2] = 0;
        //OR
        int[][] arr1 = new int[3][];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new int[3];
        }

        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1[j].length; i++) {
                arr1[j][i] = scn.nextInt();
            }
        }

        for (int[] ints : arr1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        scn.close();

        //*************Var args*************
        Syntax abc = new Syntax();
        abc.sum(1,2,2);
        abc.sum(1,2,2,5,2);
        abc.sum(1,2,2,0,-1);

        abc.argu(5, "harshit", "vanshika");
    }
}
