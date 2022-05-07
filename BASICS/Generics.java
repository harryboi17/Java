package BASICS;

import java.util.ArrayList;
import java.util.Scanner;

class MyGeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2){
        this.t1 = t1;
        this.val = val;
        this.t2 = t2;
    }
    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class Generics {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Harhsit");
        arrayList.add(223);
        arrayList.add(21);
        arrayList.add(new Scanner(System.in));

//        var a = arrayList.get(3);
        int a = (int)arrayList.get(2);
        System.out.println(a);

        MyGeneric<String, Character> g1 = new MyGeneric(22, "Harshit", 'V');
        String s = g1.getT1();
        System.out.println(s);
        char ch = g1.getT2();
        System.out.println(ch);
    }
}
