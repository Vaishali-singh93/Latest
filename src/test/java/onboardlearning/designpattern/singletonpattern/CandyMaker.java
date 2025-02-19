package onboardlearning.designpattern.singletonpattern;

public class CandyMaker {
    private boolean empty;
    private boolean boiled;

    private static CandyMaker candy_instance = null;




    public static CandyMaker getInstance() {
        synchronized (CandyMaker.class) {
            if (candy_instance == null)
                candy_instance = new CandyMaker();
        }
        return candy_instance;
    }

    private CandyMaker() {
        empty=true;
        boiled=false;
    }

    public void fill() {
        if(isEmpty()) {
            empty=false;
            boiled=false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the content to boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
