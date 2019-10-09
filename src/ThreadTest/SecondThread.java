package ThreadTest;

class SubSecondThread implements  Runnable{
    int ticket = 100;
    @Override
    public void run() {
        while(true){
            synchronized(this) {//this为当前对象
                if (ticket > 0) {
                    try {
                        Thread.currentThread().sleep(200L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "当前售票号为：" + ticket--);
                }
            }
        }
    }
}

public class SecondThread {
    public static void main(String[] args) {
        SubSecondThread sst = new SubSecondThread();
        Thread t = new Thread(sst);
        Thread t2 = new Thread(sst);
        Thread t3 = new Thread(sst);
        t.setName("1");
        t2.setName("2");
        t3.setName("3");
        t.start();
        t2.start();
        t3.start();
    }
}
