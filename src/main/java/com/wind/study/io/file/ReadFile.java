package com.wind.study.io.file;

import java.io.*;

public class ReadFile {
    public void readFileForInput(String fileName) {
        String filePath = "D:" + File.separator + fileName;
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filePath);
            byte[] buf = new byte[1024];
            int byteNum = 0;
            while ((byteNum = inputStream.read(buf)) > 0) {
                System.out.print(new String(buf, 0, byteNum));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readFileForReader(String fileName) {
        String filePath = "D:" + File.separator + fileName;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
            char[] buf = new char[24];
            int bufNum = 0;
            while ((bufNum = fileReader.read(buf)) > 0) {
                System.out.print(new String(buf, 0, bufNum));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
