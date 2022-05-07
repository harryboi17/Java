package BASICS;

import java.util.ArrayList;
import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        //BASIC
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1); a.add(3); a.add(2); a.add(-5); a.add(1, 4);

        for (int i = 0; i < 4; i++) {
            System.out.println(a.get(i));
        }

        //ADDing 2 list
        LinkedList<Integer> a2 = new LinkedList<>();
        a2.add(1); a2.add(34); a2.add(45);

        a.addAll(0, a2); // adds array list at specified idx
        for(var i : a)
            System.out.println(i);

        //to find if an element exists or not
        System.out.println(a.contains(1));
        System.out.println(a.contains(99));

        //index of first occurrence
        System.out.println(a.indexOf(1));
        //index of last occurrence
        System.out.println(a.lastIndexOf(1));

        //remove
        a.remove(4);

        //set
        a.set(1, 45); // in add we add an element, but here we replace element at that idx
    }
}
