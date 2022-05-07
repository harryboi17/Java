package BASICS;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return super.toString() + " I am toString";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " Im getMessage";
    }
}

class Negative extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negetive";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negetive!";
    }
}

public class Exception_Class {
    public static double area (int r) throws Negative{
        if(r<0){
            throw new Negative();
        }

        double result = Math.PI*r*r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a < 9){
            try {
                throw new MyException();
//                throw new ArithmeticException("This is Arithmetic Exception");
            }
            catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e); // here ToString will run by default
                e.printStackTrace(); // will display in the end
                System.out.println("Finished");
            }
            System.out.println("Yes FInished");
        }

        try{
//            int c = divide(6,0);
//            System.out.println(c);
            double ar = area(-6); //now even if functions handles exception, we have to put it in try
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Try block 2 Evoked");
            System.out.println(e);
        }
    }
}
