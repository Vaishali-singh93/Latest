package onboardlearning.designpattern.decoratorpattern;

public class Widget1 extends ViewDecorator {
    public Widget1(Webpage view) {
        super(view);
    }

    public int getRank() {
        return (super.getRank()+8);
    }


}
