package ThreadTest;

class SubThread extends Thread{
    static int ticket = 100;
    @Override
    public void run() {
        while(true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + "当前售票号为：" +ticket--);
            }else{
                break;
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //SubThread thread = new SubThread();
        SubThread w1 = new SubThread();
        SubThread w2 = new SubThread();
        SubThread w3 = new SubThread();
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口4");
        w1.start();
        w2.start();
        w3.start();
        // 不能直接调用run方法
        // 一个线程只能调用一次start();
        //thread.start();//作用：1.启动子线程 2.调用相应的run()方法
        /*for (int i = 0; i < 100; i++) {
            System.out.println("main:i = " + i);
        }*/
    }
}
