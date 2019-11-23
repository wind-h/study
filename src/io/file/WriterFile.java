package io.file;

import java.io.*;

public class WriterFile {
    public boolean WriterFileForOutput(byte[] content,String fileName){
        String filePath = "D:" + File.separator + fileName;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filePath);
            fos.write(content,0,content.length);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
    public boolean WriterFileWriter(String content,String fileName){
        String filePath = "D:" + File.separator + fileName;
        FileWriter fw = null;
        try {
            fw = new FileWriter(filePath);
            fw.write(content,0,content.length());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
