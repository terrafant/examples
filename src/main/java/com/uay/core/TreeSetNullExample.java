package com.uay.core;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetNullExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1, s2 = o2;
                if (o1 == null) {
                    s1 = "";
                }
                if (o2 == null) {
                    s2 = "";
                }
                return s1.compareTo(s2);
            }
        });
        set.add(null);
        set.add("243");
        set.add("1lp");
        set.add("2");
        set.add(null);
        System.out.println("set = " + set);
    }
}
