package Chapter5Singleton;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    //if our app is having issues with multiple threads,
    // we could use other method implementations to check if our class is instantiated or not.
    private static ChocolateBoiler getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            //fill the boiler with a milk/chocolate mixture
        }
    }

    public boolean isEmpty() {
        return empty;
    }
}
