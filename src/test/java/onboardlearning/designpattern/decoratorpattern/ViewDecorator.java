package onboardlearning.designpattern.decoratorpattern;

public abstract class ViewDecorator implements Webpage {
    private Webpage view;
    public ViewDecorator(Webpage view) {
        this.view=view;
    }

    public int getRank() {
        return view.getRank();
    }
}
