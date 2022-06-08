package com.wind.study.datastructure.sort;

/*
    选择排序：从待排序的数据中，按指定的规则选出某元素，在按规定交换位置
        规则：
            第一次从待排序数组中0 - n-1选出最小的数和索引为0的元素交换
            第二次从待排序数组中1 - n-1选出最小的数和索引为1的元素交换
            ....
            第n-1次从待排序数组中n-2 - n-1选出最小的数和索引为n-2的元素交换
        例如：
                3 4 2 5 1
           1    1 4 2 5 3
           2    1 2 4 5 3
           3    1 2 3 5 4
           4    1 2 3 4 5
         思路：
            1.先假定当前这个数是最小数
            2.然后将当前这个数和数组进行比较，如果有比当前数更小的则得到该下标
            3.本轮遍历到数组最后得到最小值的下标
            4.进行交换
 */
public class SelectionSort {


    public int[] sort(int[] array) {
        //存储最小的索引
        int minIndex = 0;
        //用于交换的临时变量
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {//循环n-1次
            minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {//如果最小值索引就在当前索引，就不用交换了
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
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
        SelectionSort s = new SelectionSort();
        s.sort(new int[]{3, 4, 2, 5, 1});
        int[] array = new int[80000];
        for (int i = 0; i < 80000; i++) {
            array[i] = (int) (Math.random() * 80000);
        }
        long l = System.currentTimeMillis();
        s.sort(array);
        l = System.currentTimeMillis() - l;
        System.out.println(l / 1000.0);
    }
}
