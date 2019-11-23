package datastructure;

import java.util.LinkedList;

/*
    约瑟夫问题：
        N个人围成一圈，从第一个人开始报数，报到m的人出圈，
    剩下的人继续从1开始报数，报到m的人出圈；如此往复，直到
    所有人出圈。
 */
public class Josephusproblem {

    private OneWayCircularList circularList = new OneWayCircularList();
    private int number = 1;

    public void loop(int nums){
        for (int i = 1; i <= 5; i++) {
            circularList.add(i);
        }
        number = nums;
    }

    public int circleOut(int number) {
        int tempNum = 1;
        while(true){
            if(tempNum == number){
                circularList.delete(number);
                tempNum = 0;
            }
            tempNum++;
        }

    }

    @Override
    public String toString() {
        return circularList.toString();
    }

    public static void main(String[] args) {
        Josephusproblem jp = new Josephusproblem();
        jp.loop(5);
        System.out.println(jp.toString());

    }
}


