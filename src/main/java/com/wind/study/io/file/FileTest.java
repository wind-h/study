package com.wind.study.io.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileTest {
    public static void readConsole() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String line = null;
        try {
            while ((line = br.readLine()) != null) {
                if (line.equals("exit")) {
                    System.exit(1);
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ReadFile read = new ReadFile();
        //read.readFileForInput("iotest.txt");
        //read.readFileForReader("iotest.txt");
        readConsole();
    }
}
