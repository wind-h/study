package datastructure;

public class Stack {
    private Object[] stack;
    private int top;
    private int length;

    public Stack(int length) {
        this.length = length;
        stack = new Object[length];
        top = -1;
    }
    public boolean isFull() {
        return top == length - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(Object data) {
        if(isFull()) {
            return ;
        }
        top++;
        stack[top] = data;
    }
    public Object pop() {
        if(isEmpty()) {
            throw  new RuntimeException("栈为空");
        }
        Object temp = stack[top];
        top--;
        return temp;
    }
    public Object peek() {
        if(isEmpty()) {
            throw  new RuntimeException("栈为空");
        }
        return stack[top];
    }

    @Override
    public String toString() {
        if(isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int tempTop = top;
        sb.append("stack[");
        for (int i = 0; i <= tempTop; i++) {
            sb.append(i + " ");
        }
        sb.append("]");
        return  sb.toString();
    }
}
class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        for (int i = 0; i < 3; i++) {
            stack.push(i);
        }
        System.out.println(stack.toString());
        for (int i = 0; i < 3; i++) {
            System.out.println(stack.pop());
            System.out.println(stack.toString());
        }
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack.toString());
    }
}