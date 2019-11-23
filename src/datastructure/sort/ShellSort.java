package datastructure.sort;
/*
    希尔排序：
        也是一种插入排序，它是简单插入排序经过改进后的一个版本，也叫缩小增量排序。
      把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；随着增量逐渐减少，
      每组包含的关键词越来越多，当增量减至1时，整个文件恰被分成一组，算法便终止
      增量每次是长度/2
     例如：
            3 4 2 5 1
        下标增量为2，即3和2和1直接插入排序，4和5直接插入排序
        1   1 4 2 5 3
        下标增量为1时和插入排序一样,插入排序就是增量为1的排序
        2   1 2 3 4 5
 */
public class ShellSort {
    public int[] sort(int[] array){
        int increment = array.length/2;
        int insertVal = 0;
        int insertIndex = 0;
        while(increment != 0) {
            for (int i = increment; i < array.length; i++) {
                insertVal = array[i];
                insertIndex = i;
                if(array[insertIndex] > array[insertIndex - increment]) {
                    for (int j = i - increment; j >= 0; j = j - increment) {
                        if (insertVal < array[j]) {
                            array[j + increment] = array[j];
                            insertIndex = j;
                        }
                    }
                    array[insertIndex] = insertVal;
                }
            }
            increment = increment/2;
        }
        return array;
    }
    public void show(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ShellSort ss = new ShellSort();
        ss.sort(new int[]{3,4,2,5,1});
        int[] array = new int[80000];
        for (int i = 0; i < 80000; i++) {
            array[i] = (int)(Math.random()*80000);
        }
        long l = System.currentTimeMillis();
        ss.sort(array);
        l = System.currentTimeMillis() - l;
        System.out.println(l/1000.0);
    }
}
