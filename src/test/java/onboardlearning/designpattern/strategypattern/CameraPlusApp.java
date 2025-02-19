package onboardlearning.designpattern.strategypattern;

public class CameraPlusApp extends ShareStrategy {


    public CameraPlusApp() {
        super(new SharePhotoViaByText());
    }
}
