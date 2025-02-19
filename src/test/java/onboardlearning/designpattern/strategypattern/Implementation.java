package onboardlearning.designpattern.strategypattern;

public class Implementation {
    public static void main(String[] args) {
        ShareStrategy ap = new CameraPlusApp();
        ap.photos();
    }
}
