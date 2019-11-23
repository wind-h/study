package model.proxytest.staticproxy;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        ProxyTeacher pt = new ProxyTeacher(t);
        pt.run();
    }
}
