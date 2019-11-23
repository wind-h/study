package Thread;

import model.Singleton.Singleton04;

class Run implements Runnable {

    volatile int i = 0;
    @Override
    public void run() {

        /*for (int j = 0; j < 100; j++) {
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i = i + 1;
            System.out.println(Thread.currentThread().getName() + ": i = " + i);
        }*/
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Singleton04 s = Singleton04.getSingleton();
        System.out.println("s = " + s);
    }
}


public class VolatileTest {
    public static void main(String[] args) {
        Run r = new Run();
        Thread t = new Thread(r);
        Thread t2 = new Thread(r);
        t.start();
        t2.start();
        r.run();
    }
}
