package com.wind.study.datastructure.sort;

/*
    冒泡排序:从前向后依次比较相邻元素的值，如果大于就交换值
        例如
                3 4 2 5 1
        1       3 4 2 5 1
                3 2 4 5 1
                3 2 4 5 1
                3 2 4 1 5
        2       2 3 4 1 5
                2 3 4 1 5
                2 3 1 4 5
        3       2 3 1 4 5
                2 1 3 4 5
        4       1 2 3 4 5



 */
public class BubbleSort {

    public int[] sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = true;//判断一次大循环中的小循环中是否进行了交换，没有交换就说明已经排好序了
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return array;
    }


    public void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        bs.sort(new int[]{3, 4, 2, 5, 1});
        int[] array = new int[80000];
        for (int i = 0; i < 80000; i++) {
            array[i] = (int) (Math.random() * 80000);
        }
        long l = System.currentTimeMillis();
        bs.sort(array);
        l = System.currentTimeMillis() - l;
        System.out.println(l / 1000.0);
    }
}
