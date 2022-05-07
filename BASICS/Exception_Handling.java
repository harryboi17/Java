package BASICS;

import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 4;
        marks[1] = 8;
        marks[2] = 5;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int idx = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with");
        int num = sc.nextInt();

        try{
            System.out.println("the value at the array idx is : " + marks[idx]);
            System.out.println("Value of arr-val/number is : " + marks[idx]/num);
        }
        catch(ArithmeticException e) { //Arithmetic block is first but, in try the out of bound
                                        //exception occurred first so next catch block will execute;
            System.out.println("ArithmeticException occurred");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutofBoundException occurred");
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }


    }
}
