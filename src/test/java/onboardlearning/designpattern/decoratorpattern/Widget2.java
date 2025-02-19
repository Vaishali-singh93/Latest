package onboardlearning.designpattern.decoratorpattern;

public class Widget2 extends ViewDecorator{
    public Widget2(Webpage view) {
        super(view);
    }

    public int getRank() {
        return super.getRank()+5;
    }


}
