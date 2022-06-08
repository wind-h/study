package com.wind.study.datastructure.sort;

/*
    插入排序：对于待排序的数据中，以插入的方式插入到适当位置
            把n个待排序的数据看成一个有序表和一个无序表，
            开始时 有序表只有一个元素，无序表有n-1个元素，
            排序过程每次从无序表中取出一个元素，与有序表的元素比较，插入到适当位置
       例如：
            (3) 4 2 5 1
        1   (3 4) 2 5 1
        2   (2 3 4) 5 1
        3   (2 3 4 5) 1
        4   (1 2 3 4 5)



 */
public class InsertionSort {
    public int[] sort(int[] array) {
        int insertVal = 0;//要插入的数
        int insertIndex = 0;
        for (int i = 1; i < array.length; i++) {
            insertVal = array[i];
            insertIndex = i;//插入的位置
            if (array[insertIndex] > array[insertIndex - 1]) {
                for (int j = i - 1; j >= 0; j--) {
                    if (insertVal < array[j]) {//判断插入的值是否小于有序表右边的值，
                        array[j + 1] = array[j];
                        insertIndex = j;//位置记录
                    }
                }
            }
            //插入到合适的位置
            if (insertIndex != i) {
                array[insertIndex] = insertVal;
            }
            //show(array);
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
        InsertionSort is = new InsertionSort();
        is.sort(new int[]{3, 4, 2, 5, 1});
        int[] array = new int[80000];
        for (int i = 0; i < 80000; i++) {
            array[i] = (int) (Math.random() * 80000);
        }
        long l = System.currentTimeMillis();
        is.sort(array);
        l = System.currentTimeMillis() - l;
        System.out.println(l / 1000.0);


    }
}
