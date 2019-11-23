package datastructure.search;

public class LinearSearch {
    public Integer search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        Integer search = ls.search(new int[]{2, 1, 5, 4, 7, 3, 6}, 5);
        System.out.println(search);
    }
}
