package datastructure.search;

import java.util.HashMap;

/*
    二分查找

 */
public class BinarySearch {
    public Integer search(int[] array, int value, int left, int right) {
        if(right < left){
            return null;
        }
        int middle = (left + right) / 2;
        if(array[middle] == value){
            return middle;
        }else if(value > array[middle]) {
            return search(array, value, middle + 1, right);
        }else if(value < array[middle]) {
            return search(array, value, left, middle - 1);
        }
        return null;
    }

    public Integer binarySearch(int[] array, int value) {
        return  search(array, value, 0, array.length - 1);
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        Integer search = bs.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10);
        System.out.println(search);
    }
}
