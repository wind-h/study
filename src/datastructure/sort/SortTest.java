package datastructure.sort;

public class SortTest {
    public static void main(String[] args) {
        //冒泡排序
        BubbleSort bubbleSort = new BubbleSort();
        //选择排序
        SelectionSort selectionSort = new SelectionSort();
        //插入排序
        InsertionSort insertionSort = new InsertionSort();
        //希尔排序
        ShellSort shellSort = new ShellSort();
        //快速排序
        QuickSort quickSort = new QuickSort();
        int[] array = new int[800000];
        for (int i = 0; i < 800000; i++) {
            array[i] = (int)(Math.random()*8000000);
        }
        int[] array1 = array.clone();
        int[] array2 = array.clone();
        int[] array3 = array.clone();
        int[] array4 = array.clone();
        long l,l2;
        //冒泡排序
        /*l = System.currentTimeMillis();
        bubbleSort.sort(array);
        l2 = System.currentTimeMillis();
        System.out.println("冒泡排序:" + (l2-l)/1000.0);*/
        /*//选择排序
        l = System.currentTimeMillis();
        selectionSort.sort(array1);
        l2 = System.currentTimeMillis();
        System.out.println("选择排序:" + (l2-l)/1000.0);*/
        //插入排序
        /*l = System.currentTimeMillis();
        insertionSort.sort(array2);
        l2 = System.currentTimeMillis();
        System.out.println("插入排序:" + (l2-l)/1000.0);*/
        //希尔排序
        /*l = System.currentTimeMillis();
        shellSort.sort(array3);
        l2 = System.currentTimeMillis();
        System.out.println("希尔排序" + (l2-l)/1000.0);*/
        //快速排序
        l = System.currentTimeMillis();
        quickSort.sort(array4,0,array4.length-1);
        l2 = System.currentTimeMillis();
        System.out.println("快速排序" + (l2-l)/1000.0);
    }
}
