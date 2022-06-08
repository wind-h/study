package com.wind.study.datastructure;

public class OneWayCircularList {
    /*
        结点
    */
    private class Node {
        private int data;
        private Node next;
    }

    //头结点
    private Node head;
    //链表长度
    private int length;

    public OneWayCircularList() {
        head = new Node();
        head.data = 0;
        head.next = head;
    }

    /*
        1.创建一个临时变量temp，遍历到最后一个结点
        2.newNode.next = temp.next
        3.temp.next = newNode;
     */
    public void add(int data) {
        //创建一个新结点
        Node newNode = new Node();
        newNode.data = data;
        //创建一个临时结点temp
        Node temp = new Node();
        temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        //新结点的next指向头
        newNode.next = temp.next;
        //最后一个结点指向newNode
        temp.next = newNode;
        length++;
    }

    /*
        1.创建一个临时结点temp用于遍历到指定结点的前一个结点
        2.newNode.next = temp.next
        2.temp.next = newNode;
     */
    public boolean insert(int data, int num) {
        //判断num是否在length+1之内，插入在length+1相当于add();
        if (num <= 0 || num > length + 1) {
            return false;
        }
        //创建一个newNode
        Node newNode = new Node();
        newNode.data = data;
        //创建一个临时结点temp
        Node temp = new Node();
        temp = head.next;
        int tempNum = 1;
        while (temp != head) {
            if (tempNum == num - 1) {
                break;
            }
            temp = temp.next;
            tempNum++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return true;
    }

    /*
        1.创建一个临时结点temp，遍历链表到指定结点的前一个结点
        2.temp.next = temp.next.next;
     */
    public boolean delete(int data) {
        Node temp = new Node();
        temp = head;
        while (temp.next != head) {
            if (temp.next.data == data) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (head.next == head) {
            return null;
        }
        Node temp = head;
        sb.append("LinkedList[");
        while (temp.next != head) {
            temp = temp.next;
            sb.append(temp.data + " ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        OneWayCircularList ll = new OneWayCircularList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll.toString());
        ll.insert(4, 4);
        ll.insert(6, 5);
        System.out.println(ll.toString());
        ll.delete(5);
        System.out.println(ll.toString());
        ll.delete(1);
        System.out.println(ll.toString());
        ll.delete(3);
        System.out.println(ll.toString());
        ll.delete(2);
        System.out.println(ll.toString());
        ll.delete(4);
        System.out.println(ll.toString());
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll.toString());
        ll.delete(4);
        System.out.println(ll.toString());
    }
}
