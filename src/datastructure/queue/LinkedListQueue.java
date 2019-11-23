package datastructure.queue;

public class LinkedListQueue {
    /**
     * 结点
     */
    private class Node {
        //数据
        Integer data;
        //指向下一个的结点
        Node next;
        //指向上一个的结点
        Node pre;
        public Node() {
            data = null;
            next = null;
            pre = null;
        }
        public Node(Node pre, Node next, Integer data) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }
    }
    //队首
    private Node front;
    //队尾
    private Node rear;
    //队列大小
    private int size;

    public LinkedListQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    /**
     * 添加元素到队列尾部
     * @param data 将元素添加到队列里
     * @return 添加是否成功
     */
    public boolean offer(int data) {
        Node l = rear;
        Node newNode = new Node(l,null, data);
        rear = newNode;
        if (l == null) {
            front = newNode;
        } else {
            l.next = newNode;
        }
        size++;
        return true;
    }

    /**
     * 移除队首元素并返回队首元素，如果队列为空则抛出异常
     * @return 返回队首员
     */
    public Integer poll() {
        //创建一个临时结点保存头结点
        Node l = front;
        if (l == null) {
            throw new RuntimeException("队列为空");
        }
        //头结点向后移一个结点
        front = front.next;
        //保存以前的头结点的数据
        Integer data = l.data;
        //将以前的头结点的所有指向变为null
        l.data = null;
        l.next = null;
        //如果下个结点为空，说明没有了结点，要将尾结点指向null
        if (front == null) {
            rear = null;
        } else {
            front.pre = null;
        }
        size--;
        return data;
    }
    /**
     * 取队列的第一个元素，队列如果为空，则抛出异常
     * @return 返回值为队列的第一个元素
     */
    public Integer element() {
        if (front == null) {
            throw new RuntimeException("队列为空");
        }
        return front.data;
    }

    /**
     * 取队列第一个元素，队列如果为空，则返回null
     * @return 返回值为队列的第一个元素
     */
    public Integer peek() {
        if(front == null) {
            return null;
        }
        return front.data;
    }

    @Override
    public String toString() {
        if (front == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("[");
        for (Node x = front; x != null; x = x.next ) {
            if (x.next == null ) {
                sb.append(x.data);
                break;
            }
            sb.append(x.data + " ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedListQueue aq = new LinkedListQueue();
        for (int i = 1; i <= 3; i++) {
            aq.offer(i);
        }
        System.out.println(aq.toString());
        System.out.println("出队列元素: " + aq.poll());
        System.out.println(aq.toString());
        aq.offer(4);
        System.out.println(aq.toString());
        System.out.println("队首元素: " + aq.peek());
        System.out.println(aq.toString());
        System.out.println("队首元素: " + aq.element());
        System.out.println(aq.toString());
        System.out.println("出队列元素: " + aq.poll());
        System.out.println(aq.toString());
        System.out.println("出队列元素: " + aq.poll());
        System.out.println(aq.toString());
        System.out.println("出队列元素: " + aq.poll());
        System.out.println(aq.toString());
        aq.offer(5);
        System.out.println(aq.toString());
        aq.offer(6);
        System.out.println(aq.toString());
    }
}
