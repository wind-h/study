package com.wind.study.datastructure;

public class DoubleLinkedList {
    /*
        结点
    */
    private class Node {
        //数据
        private int data;
        //指向前一个结点
        private Node pre;
        //指向后一个结点
        private Node next;
    }

    //头结点
    private Node head;
    //链表长度
    private int length;

    public DoubleLinkedList() {
        head = new Node();
        head.data = 0;
        head.pre = null;
        head.next = null;
    }

    /*
        1.创建一个临时变量temp,遍历到最后
        2.temp.next = newNode;
        3.newNode.pre = temp;
    */
    public void add(int data) {
        //创建新结点保存数据
        Node newNode = new Node();
        newNode.data = data;
        //创建一个结点temp,用于遍历到链表最后
        Node temp = head;
        //使temp成为最后一个结点，每次判断当前结点的next(即下一个结点)是否为空
        while (temp.next != null) {
            temp = temp.next;
        }
        //最后一个节点的next指向新结点
        temp.next = newNode;
        //newNode的pre指向前一个结点
        newNode.pre = temp;
        //新结点的next指向空
        newNode.next = null;
        //链表长度加1
        length++;
    }

    /*
        1.创建一个临时变量temp,遍历到要插入的结点
        2.newNode.next = temp
        3.temp.pre.next = newNode
        4.newNode.pre = temp.pre
        5.temp.pre = temp;
     */
    public boolean insert(int data, int num) {
        //判断插入的位置是否在链表的长度之内
        if (num <= 0 || num > (length + 1)) {
            return false;
        }
        //创建新结点保存数据
        Node newNode = new Node();
        newNode.data = data;
        //创建一个节点temp,用于遍历到指定结点的前一个结点
        Node temp = head.next;
        int tempNum = 1;
        while (temp != null) {
            //到达指定结点后，退出循环
            if (tempNum == num) {
                break;
            }
            temp = temp.next;
            tempNum++;
        }
        newNode.next = temp;
        temp.pre.next = newNode;
        newNode.pre = temp.pre;
        temp.pre = temp;
        //长度加1
        length++;
        return true;
    }

    /*
        1.判断修改的结点是否在链表的长度之内
        2.创建一个临时结点来遍历到指定节点
        3.修改指定结点的数据
     */
    public boolean update(int data, int num) {
        //判断修改的结点是否在链表的长度之内
        if (num <= 0 || num > length) {
            return false;
        }
        //创建一个结点temp,用于遍历到指定结点
        Node temp = head.next;
        int tempNum = 1;
        while (temp != null) {
            if (tempNum == num) {
                temp.data = data;
                break;
            }
            temp = temp.next;
            tempNum++;
        }
        return true;
    }

    /*
        1.创建一个临时结点temp,遍历到要删除的结点
        2.temp.pre.next = temp.next
        3.temp.next.pre = temp.pre

     */
    public boolean delete(int data) {
        if (head.next == null) {
            return false;
        }
        //创建一个结点temp,用于遍历到指定结点
        Node temp = head.next;
        while (temp != null) {
            if (temp.data == data) {
                temp.pre.next = temp.next;
                if (temp.next != null) {
                    temp.next.pre = temp.pre;
                }
                length--;
            }
            temp = temp.next;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (head.next == null) {
            return null;
        }
        Node temp = head;
        sb.append("LinkedList[");
        while (temp.next != null) {
            temp = temp.next;
            sb.append(temp.data + " ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll.toString());
        ll.insert(4, 4);
        ll.insert(6, 5);
        System.out.println(ll.toString());
        ll.update(5, 5);
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

    }
}
