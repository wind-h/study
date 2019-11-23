package Thread;

import java.util.concurrent.locks.ReentrantLock;

class A{

}
class B{

}


class dead implements  Runnable{
    private A a = new A();
    private B b = new B();
    private ReentrantLock lock01 = new ReentrantLock();
    private ReentrantLock lock02 = new ReentrantLock();
    /*@Override
    public void run() {
        synchronized (b){
            System.out.println("正在使用b");
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (a){
                System.out.println("正在使用a");
            }
            System.out.println("释放a");
        }
        System.out.println("释放b");
    }

    public void dead(){
        synchronized (a){
            System.out.println("正在使用a");
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (b){
                System.out.println("正在使用b");
            }
            System.out.println("释放b");
        }
        System.out.println("释放a");
    }*/
    @Override
    public void run() {
        lock01.lock();
            System.out.println("正在使用b");
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock02.lock();
                System.out.println("正在使用a");
            lock02.unlock();
            System.out.println("释放a");
        lock01.unlock();
        System.out.println("释放b");
    }

    public void dead(){
        lock02.lock();
            System.out.println("正在使用a");
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock01.lock();
                System.out.println("正在使用b");
            lock01.lock();
            System.out.println("释放b");
        lock02.lock();

    }
}



public class Lock {
    public static void main(String[] args) {
        dead d = new dead();
        new Thread(d).start();
        d.dead();
    }
}
