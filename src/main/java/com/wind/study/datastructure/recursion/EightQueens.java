package com.wind.study.datastructure.recursion;

/*
   八皇后问题
   用一个一维数组存储，例如  queen[0] = 0; 第一行第一列放置了一个皇后
   判断一个皇后是否在另一个皇后所在的对角线，行列上，
*/


public class EightQueens {
    private int max = 8;
    private int[] queen = new int[]{-1, -1, -1, -1, -1, -1, -1, -1};
    int num = 0;

    //放置第n个皇后
    public void place(int n) {
        if (n == max) {
            for (int i = 0; i < max; i++) {
                System.out.print(queen[i] + " ");
            }
            System.out.println();
            return;
        }
        //依次放入8个皇后
        for (int i = 0; i < max; i++) {
            //先把这个皇后放置在第1列
            num++;
            queen[n] = i;
            if (judge(n)) {//不冲突
                place(n + 1);//放下一个皇后
            }
        }
    }

    public boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            //queen[i]的值 == queen[n]的值 判断是否在同一列
            //后面的条件是否在同一斜线上。
            if (queen[i] == queen[n] || Math.abs(i - n) == Math.abs(queen[i] - queen[n])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        EightQueens e = new EightQueens();
        long l = System.currentTimeMillis();
        e.place(0);
        System.out.println(e.num);
        l = l - System.currentTimeMillis();
        System.out.println(l);
    }
}
