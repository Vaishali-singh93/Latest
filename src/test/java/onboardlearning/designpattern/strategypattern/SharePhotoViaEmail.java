package onboardlearning.designpattern.strategypattern;

public class SharePhotoViaEmail implements PhoneCameraApp {
    @Override
    public void share() {
        System.out.println("share via email");
    }
}
