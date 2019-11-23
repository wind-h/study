package datastructure.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Array {
    private int[] array;
    private int length;
    private int size = 0;

    public Array(int length) {
        this.length = length;
        array = new int[length];
    }

    public void add(int data) {
        if(size == length) {
            return ;
        }
        array[size] = data;
        size++;
    }

    public int delete(int data) {
        return 0;
    }

    public static void main(String[] args) {
        int[] x = new int[5];
        ArrayList al = new ArrayList();
        //al.remove(1);
        LinkedList linkedList = new LinkedList();
        HashMap y = new HashMap();
        HashSet hashSet = new HashSet();
    }



}
