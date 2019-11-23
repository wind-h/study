package collection;

class Node{
    private int date;
    private Node next;

    public Node() {
    }

    public Node(int date) {
        this.date = date;
        this.next = null;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class SingleLinkList {
    private Node head = null;
    private int sum;
    public void add(int date){
        Node newNode = new Node(date);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        sum++;
    }

    public boolean remove(int index){
        if(index < 1 || index > sum){
            return false;
        }else{
            if(index == 1){
                head = head.getNext();
                return true;
            }else{
                Node temp = head;
                int i = 1;
                while(temp != null){
                    if(index-1 == i){
                        temp.setNext(temp.getNext().getNext());
                        break;
                    }
                    temp = temp.getNext();
                    i++;
                }
            }
        }
        sum--;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(head == null){
            return null;
        }else{
            Node temp = head;
            sb.append("[");
            while(temp != null){
                sb.append(temp.getDate()+",");
                temp = temp.getNext();
            }
            int i = sb.lastIndexOf(",");
            sb.replace(i,i+1,"");
            sb.append("]");
        }
        return sb.toString();
    }
}
class test{
    public static void main(String[] args) {
        SingleLinkList sll = new SingleLinkList();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.remove(3);
        sll.remove(4);
        System.out.println("sll = " + sll);
    }
}
