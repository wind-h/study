package com.wind.study.datastructure.hashtable;

/**
 * 哈希表：是根据关键码值而直接进行访问的数据结构，。通过吧关键码值映射到表中一个位置来访问记录，
 * 以加快查找的速度。这个映射函数叫做散列函数，存放记录的数组叫做散列表
 * 数组+链表
 */
public class HashTable {
    private LinkedList[] linkedListArray;

    public HashTable(int length) {
        linkedListArray = new LinkedList[length];
        for (int i = 0; i < linkedListArray.length; i++) {
            linkedListArray[i] = new LinkedList();
        }
    }

    public void add(int data) {
        //根据散列函数添加到指定链表中
        int index = hashFunction(data);
        linkedListArray[index].add(data);
    }

    public void list() {
        for (int i = 0; i < linkedListArray.length; i++) {
            System.out.print("第" + i + "条链表");
            linkedListArray[i].list();
        }
    }

    //编写散列函数
    public int hashFunction(int data) {
        return data % linkedListArray.length;
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(5);
        ht.add(4);
        ht.list();
        ht.add(5);
        ht.list();
        ht.add(1);
        ht.list();
        ht.add(16);
        ht.list();
    }
}

class LinkedList {
    //结点
    class Node {
        private int data;
        private Node next;

        public Node() {
            data = 0;
            next = null;
        }
    }

    private Node head;

    //添加结点，直接加入到本链表的最后一个
    public void add(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            head = newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }

    public void list() {
        if (head == null) {
            System.out.println("为空");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print("=> " + temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

