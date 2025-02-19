package onboardlearning.designpattern.strategypattern;

public class SharePhotoViaByText implements PhoneCameraApp {
    @Override
    public void share() {
        System.out.println("share via text");
    }
}
