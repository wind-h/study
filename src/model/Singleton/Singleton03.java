package model.Singleton;

public class Singleton03 {
    private static Singleton03 singleton;
    private Singleton03(){}
    public static Singleton03 getSingleton(){
        if(singleton == null){
            singleton = new Singleton03();
        }
        return singleton;
    }
}
