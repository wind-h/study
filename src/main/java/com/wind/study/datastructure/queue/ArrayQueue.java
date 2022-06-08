package com.wind.study.datastructure.queue;

/**
 * @author huangshichuan
 */
public class ArrayQueue {
    // 队首
    private Integer front = 0;
    // 队尾
    private Integer rear = 0;
    // 数组长度
    private Integer length;
    // 数组,存取队列
    private Integer[] array;

    public ArrayQueue(Integer length) {
        this.length = length;
        array = new Integer[length];
    }

    /**
     * 判断对列是否已满
     *
     * @return
     */

    public boolean isFull() {
        return ((rear + 1) % length) == front;
    }

    /**
     * 判断队列是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return rear == front;
    }

    /**
     * 添加一个元素到队尾，如果队列已经满了，则返回false,否则返回true
     *
     * @param data 添加到队列的元素
     * @return 添加元素是否成功
     */
    public boolean offer(Integer data) {
        //判断是否满，如果队列已满返回false
        if (isFull()) {
            return false;
        }
        //没有满，则加入队列
        array[rear] = data;
        //尾指针向后一格
        rear = (rear + 1) % length;
        return true;
    }

    /**
     * 移除队列第一个元素并返回该元素，如果队列为空，则抛出异常
     *
     * @return 返回值是队列的第一个元素
     */
    public Integer poll() {
        //判断队列是否为空，为空则抛出异常
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        //取出第一个元素
        int temp = array[front];
        //向后一格并取模
        front = (front + 1) % length;
        return temp;
    }

    /**
     * 取队列的第一个元素，队列如果为空，则抛出异常
     *
     * @return 返回值为队列的第一个元素
     */
    public Integer element() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return array[front];
    }

    /**
     * 取队列第一个元素，队列如果为空，则返回null
     *
     * @return 返回值为队列的第一个元素
     */
    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return array[front];
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("queue[");
        int queueSize = (rear + length - front) % length;
        for (int i = front; i < front + queueSize; i++) {
            if ((i % length) == ((rear + length) - 1) % length) {
                sb.append(array[i % length]);
            } else {
                sb.append(array[i % length] + ", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

class Test {
    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue(4);
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