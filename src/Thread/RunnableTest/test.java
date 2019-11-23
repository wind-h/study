package Thread.RunnableTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class test {
    public static void test(){
        System.out.println("静态方法");
    }
    public static void main(String[] args) {
        Ticket t = new Ticket();
        /*new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();*/
        test x = null;
        x.test();
        try {
            Class c = Class.forName("Maths");
            Object o= c.newInstance();
            Maths s = (Maths)o;
            s.x();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
class Maths{
    public void x(){

    }
}