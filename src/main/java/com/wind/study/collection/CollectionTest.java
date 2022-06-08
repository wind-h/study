package com.wind.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("孙悟空");
        collection.add("1");
        System.out.println(collection.size());
        collection.remove("1");
        System.out.println(collection.size());
        for (int i = 0; i < 4; i++) {
            collection.add(i);
        }
        System.out.println(collection.contains("孙悟空"));
        collection.remove("孙悟空");
        Collection num = new HashSet();
        for (int i = 3; i < 8; i++) {
            num.add(i);
        }
        num.forEach(obj -> {
            System.out.println("obj = " + obj);
        });
        Iterator iterator = num.iterator();
        /*while(iterator.hasNext()){
            int x = (int) iterator.next();
            if(x == 5 ){
                iterator.remove();
            }
            System.out.println(x);
        }*/
        iterator.forEachRemaining(obj -> {
            System.out.println("obj = " + obj);
        });
        for (Object o : num) {
            System.out.println("o = " + o);
        }
        num.removeIf(obj -> (int) obj > 5);
        System.out.println(num);
        System.out.println(collection.containsAll(num));
        collection.removeAll(num);
        System.out.println(collection);
    }
}
