package com.wind.study.datastructure;

import java.io.*;

public class SparseArray {

    public int[][] arrayToSparseArray(int[][] array) {

        int sum = 0;
        int rowLength = 0;
        int colLength = 0;
        for (int[] row : array) {
            rowLength++;
            colLength = row.length;
            for (int col : row) {
                if (col != 0) {
                    sum++;
                }
            }
        }

        int[][] sparseArray = new int[sum + 1][3];

        sparseArray[0][0] = rowLength;
        sparseArray[0][1] = colLength;
        sparseArray[0][2] = sum;

        int count = 0;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (array[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = array[i][j];
                }
            }
        }

        return sparseArray;
    }

    public int[][] SparseArrayToArray(int[][] sparseArray) {

        int[][] array = new int[sparseArray[0][0]][sparseArray[0][1]];

        for (int i = 1; i <= sparseArray[0][2]; i++) {
            array[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        return array;
    }

    public int[][] readSparseArray() {
        return null;
    }

    public void writeSparseArray(int[][] sparseArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sparseArray[0][2]; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(sparseArray[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        File file = new File("." + File.separator + "SparseArray.txt");
        try {
            FileOutputStream os = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        int[][] array = new int[7][7];
        array[2][3] = 1;
        array[2][4] = 2;
        SparseArray sa = new SparseArray();
        int[][] sparseArray = sa.arrayToSparseArray(array);
        for (int[] ints : sparseArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        int[][] array2 = sa.SparseArrayToArray(sparseArray);
        for (int[] ints : array2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }


}
