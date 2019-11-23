package datastructure.tree;
/*
    5 4 8 2 9 1 40 15 0
            5
         4     8
       2          9
    1                40
  0                15
 */
public class BinaryTree {
    private class Node {
        private int data;
        private Node left;
        private Node right;
        public Node() {
            data = 0;
            left = null;
            right = null;
        }
        //前序遍历
        public void preorderTraversal() {
            System.out.print(this.data + " ");
            if(this.left != null) {
                this.left.preorderTraversal();
            }
            if(this.right != null) {
                this.right.preorderTraversal();
            }
        }
        //中序遍历
        public void sequentialTraversal() {
            if(this.left != null) {
                this.left.sequentialTraversal();
            }
            System.out.print(this.data + " ");
            if(this.right != null) {
                this.right.sequentialTraversal();
            }
        }
        //后序遍历
        public void postorderTraversal() {
            if(this.left != null) {
                this.left.postorderTraversal();
            }
            if(this.right != null) {
                this.right.postorderTraversal();
            }
            System.out.print(this.data + " ");
        }

    }
    private Node root;

    public void add(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(root == null){
            root = newNode;
            return;
        }
        Node temp = root;
        while(true) {
            if(data >= temp.data) {
                if(temp.right == null) {
                    temp.right = newNode;
                    break;
                }
                temp = temp.right;
            }else if( data <= temp.data) {
                if(temp.left == null) {
                    temp.left = newNode;
                    break;
                }
                temp = temp.left;
            }
        }
    }
    //前序遍历
    public void preorderTraversal() {
        if(root != null) {
            root.preorderTraversal();
            System.out.println();
        }else{
            System.out.println("为空");
        }
    }
    //中序遍历
    public void sequentialTraversal() {
        if(root != null) {
            root.sequentialTraversal();
            System.out.println();
        }else{
            System.out.println("为空");
        }
    }
    //后序遍历
    public void postorderTraversal() {
        if(root != null) {
            root.postorderTraversal();
            System.out.println();
        }else{
            System.out.println("为空");
        }
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(5);
        bt.add(4);
        bt.add(8);
        bt.add(2);
        bt.add(9);
        bt.add(1);
        bt.add(40);
        bt.add(15);
        bt.add(0);
        bt.preorderTraversal();
        bt.sequentialTraversal();
        bt.postorderTraversal();

    }
}