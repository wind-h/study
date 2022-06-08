package com.wind.study.datastructure;

public class LinkedList {
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

    public LinkedList() {
        head = new Node();
        head.data = 0;
        head.next = null;
    }

    /*
        1.创建一个新结点用于保存数据
        2.找到当前链表的最后一个结点
        3.将最后结点的next指向新结点
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
        //新结点的next指向空
        newNode.next = null;
        //链表长度加1
        length++;
    }

    /*
        1.创建一个新的结点保存数据
        2.找到当前链表的要插入的前一个结点
        3.新结点的next等于前一个结点的next
        4.前一个结点的next等于新结点
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
        Node temp = head;
        int tempNum = 0;
        while (temp.next != null) {
            //到达指定结点的前一个结点后，退出循环
            if (tempNum == num - 1) {
                break;
            }
            temp = temp.next;
            tempNum++;
        }
        //前一个结点的next赋值给新结点的next
        newNode.next = temp.next;
        //前一个结点的next指向新结点
        temp.next = newNode;
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
        1.找到数据为data的结点的前一个结点
		2.让前一个结点的next = 数据为data的结点.next(前一个结点的next.next)

     */
    public boolean delete(int data) {
        if (head.next == null) {
            return false;
        }
        //创建一个结点temp,用于遍历到指定结点的前一个结点
        Node temp = head;
        while (temp.next != null) {
            //
            if (temp.next.data == data) {
                temp.next = temp.next.next;
                length--;
                return true;
            }
            temp = temp.next;
        }
        return false;
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