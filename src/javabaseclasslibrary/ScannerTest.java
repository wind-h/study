package javabaseclasslibrary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            System.out.println("ff:" + scanner.next());
        }*/
        try {
            Scanner scanner = new Scanner(new File("D:" + File.separator + "iotest.txt"));
            /*while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }*/
            while(scanner.hasNext()){
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
