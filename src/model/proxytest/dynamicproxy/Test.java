package model.proxytest.dynamicproxy;

public class Test {
    public static void main(String[] args) {
        /*Teacher t = new Teacher();
        DynamicProxy dp = new DynamicProxy(t);
        Person person = (Person) dp.getTarget();
        person.run();*/
        Person p = (Person)new DynamicProxy(new Teacher()).getTarget();
        p.run();
    }
}
