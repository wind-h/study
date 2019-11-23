package model.Factory.SimpleFactory;

public class Printer implements  Output {
    private String msg;
    @Override
    public void getDate(String msg) {
        this.msg = msg;
    }

    @Override
    public void out() {
        System.out.println(msg);
    }
}
