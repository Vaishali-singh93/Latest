package onboardlearning.designpattern.decoratorpattern;

public class ImplementDecorator {

    public static void main(String[] args) {
        Webpage pageViewRank =new Widget1(new Widget2(new DesktopView()));
        System.out.println("rank of desktop view "+pageViewRank.getRank());
    }
}
