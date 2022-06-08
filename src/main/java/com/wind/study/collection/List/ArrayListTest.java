package com.wind.study.collection.List;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        for (int i = 0; i < 5; i++) {
            array.add(i);
        }
        array.add(1, 3);
        for (Object o : array) {
            System.out.println(o);
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        array.remove(2);
        System.out.println(array.indexOf(3));
        System.out.println("array = " + array.indexOf(3));
        ListIterator listIterator = array.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("listIterator = " + listIterator.next());
            listIterator.add("-----------");
        }
        while (listIterator.hasPrevious()) {
            System.out.println("listIterator = " + listIterator.previous());
        }
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        // integers.add(1);
        Object obj = new Object();
        List alist = new ArrayList<Object>();
        List blist = new LinkedList<Object>();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            alist.add(0, obj);
        }
        long t2 = System.currentTimeMillis() - t1;
        long t3 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            blist.add(0, obj);
        }
        long t4 = System.currentTimeMillis() - t3;
        System.out.println(t2 + " " + t4);
    }
}
