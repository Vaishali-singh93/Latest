package onboardlearning.designpattern.strategypattern;

public class BasicCameraApp extends ShareStrategy {

    public BasicCameraApp() {
        super(new SharePhotoViaEmail());
    }
}
