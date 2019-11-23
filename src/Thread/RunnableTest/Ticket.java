package Thread.RunnableTest;

public class Ticket implements Runnable{
    private int ticket = 100;
    private Pay pay = new Pay(40);
    public Ticket(){}

    @Override
    public void run() {
        while(true){
            synchronized (this) {
                if (ticket > 0) {
                    String name = Thread.currentThread().getName();
                    //支付
                    Thread thread = new Thread(pay);
                    thread.start();
                    try {
                        thread.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(name + ":" + "票号" + ticket);
                    ticket--;
                } else {
                    System.out.println("车票已售罄!");
                    return;
                }
            }
        }
    }
}
