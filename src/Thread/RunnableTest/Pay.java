package Thread.RunnableTest;

import java.util.concurrent.locks.ReentrantLock;

public class Pay implements Runnable {
    private int account = 1000;
    private int PaymentAmount;

    public Pay(int paymentAmount) {
        this.PaymentAmount = paymentAmount;
    }

    @Override
    public void run() {
        System.out.println("正在支付中");
        if(account > PaymentAmount){
            account = account - PaymentAmount;
            System.out.println("支付后金额；" + account);
        }else{
            System.out.println("余额不足");
            return;
        }
        System.out.println("支付成功");
    }
}
