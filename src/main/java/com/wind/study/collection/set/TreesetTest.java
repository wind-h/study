package com.wind.study.collection.set;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetTest {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        for (int i = 0; i < 5; i++) {
            tree.add(i);
        }
        System.out.println(tree.first());
        System.out.println(tree.last());
        System.out.println(tree.lower(3));
        System.out.println(tree.higher(3));
        System.out.println(tree.subSet(0,3));
        System.out.println(tree.headSet(3));
        System.out.println(tree.tailSet(3));
        Iterator iterator = tree.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Object o : tree) {
            System.out.println("o = " + o);
        }
        for (int i = 0; i < 30; i++) {
            tree.add((int)(Math.random()*100));
        }
        for (Object o : tree) {
            System.out.print(o+" ");
        }
        //tree.add(new Date());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add((int)(Math.random()*10));
        }
        System.out.println(arrayList);
        TreeSet objects = new TreeSet<>();
        objects.addAll(arrayList);
        arrayList.addAll(objects);
        System.out.println(objects);

    }
}
