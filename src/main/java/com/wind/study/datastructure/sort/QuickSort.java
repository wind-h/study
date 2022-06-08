package com.wind.study.datastructure.sort;

/*
    快速排序：快速排序是对冒泡排序的一种改进。通过一趟排序将要排序的数据分割成独立的两部分，
          其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据
          分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列
     例如：
            3 4 2 5 1
      第一次选择3作为中间数，把比三大的放左边，比三小的放右边
            1 2 3 5 4
      第二次右边选择以2作为中间数重复上面过程，左边以4作为中间数重复上面过程
            1 2 3 4 5
      思路：设置两个变量left,right,分别代表最左端下标和最右端下标，设置基准值为3
            1.right从右向左移动，查找比3小的数，首先right = 4,发现array[4]比3小，right停止移动，与array[left]交换数据
            ，数组元素为1 4 2 5 1
            2.left从左向右移动，查找一个比3大的数，left移动到1时，发现array[1]比3大，与array[right]交换数据
            ，数组元素为1 4 2 5 4
            3.再right移动，到达2时，发现2比3小，right此时为2，与array[left)交换数据
            ，数据元素为1 2 2 5 4
            4.再left移动，left = 2 此时发现left == right，循环终止
            5.将基准值3赋给array[left],数组元素为1 2 3 5 4

 */
public class QuickSort {
    public void sort(int[] array, int left, int right) {
        int l = left;
        int r = right;
        if (l < r) {
            int base = array[left];
            //判断left是否到与right
            while (l < r) {
                //从右边开始找一个比base值小的数，记录下标
                while (l < r && array[r] >= base) {
                    r--;
                }
                array[l] = array[r];
                //从左边框开始找一个比base值大的数，记录下标
                while (l < r && array[l] <= base) {
                    l++;
                }
                array[r] = array[l];
            }
            array[r] = base;
            sort(array, left, l - 1);
            sort(array, r + 1, right);
        }
    }

    public void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[80];
        for (int i = 0; i < 80; i++) {
            array[i] = (int) (Math.random() * 800);
        }
        QuickSort quickSort = new QuickSort();
        quickSort.sort(new int[]{3, 4, 2, 5, 1}, 0, 4);
        quickSort.sort(array, 0, array.length - 1);
        quickSort.show(array);
    }
}
