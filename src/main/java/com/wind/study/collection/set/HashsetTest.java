package com.wind.study.collection.set;

import java.util.HashSet;
import java.util.Iterator;

class A{
    int count;

    public A(){};

    public A(int count){
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj != null && obj.getClass() == A.class){
            A a = (A)obj;
            return this.count == a.count;
        }
        return false;
    }

    @Override
    public int hashCode() {

        return this.count;
    }

    @Override
    public String toString() {
        return "A{" +
                "count=" + count +
                '}';
    }
}


public class HashsetTest {
    public static void main(String[] args) {
        HashSet<A> set = new HashSet<>();
        set.add(new A(4));
        set.add(new A(2));
        set.add(new A(6));
        set.add(new A(-4));
        System.out.println(set);
        Iterator<A> iterator = set.iterator();
        A next = iterator.next();
        next.count=4;
        System.out.println(set);
        set.remove(new A(4));
        System.out.println(set);
        System.out.println(set.contains(new A(4)));
        System.out.println(set.contains(new A(2)));
    }
}
