package Chapter5Singleton;

public class Singleton {
    private static Singleton uniqueInstance;
    //Other useful instance variables here.
    private Singleton(){
    }

    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    //Other useful methods here.
}
