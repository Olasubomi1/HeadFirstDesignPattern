package Chapter5Singleton;

public class Singleton {
    /**
     *THE SINGLETON PATTERN
     *  The Singleton Pattern ensures a class has only one
     * instance, and provides a global point of access to it.
     */
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
