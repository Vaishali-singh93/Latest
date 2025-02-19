package onboardlearning.designpattern.singletonpattern;

public class SingletonImplementation {

    public static void main(String[] args) {
        CandyMaker candy = CandyMaker.getInstance();
        System.out.println("before boiled value :"+candy.isBoiled()+"--empty value: "+candy.isEmpty());
        // fill boiler
        candy.fill();
        System.out.println("after fill: boiled value :"+candy.isBoiled()+"--empty value: "+candy.isEmpty());
        //boil the mixure
        candy.boil();
        System.out.println("after boil: boiled value :"+candy.isBoiled()+"--empty value: "+candy.isEmpty());
        //drain mixure
        candy.drain();
        System.out.println("after drain -boiled value"+candy.isBoiled()+"--empty value"+candy.isEmpty());
    }
}
