package src;

import java.util.ArrayList;
import java.util.List;


public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list0 = new ArrayList<>();

        // Makes use of polymorphism
        List list = new ArrayList<>();

        // Local variable with "var" keyword, Java 10
        var list2 = new ArrayList<Integer>();

        System.out.println(list0.getClass());
        System.out.println(list.getClass());
        System.out.println(list2.getClass());
    }
}
