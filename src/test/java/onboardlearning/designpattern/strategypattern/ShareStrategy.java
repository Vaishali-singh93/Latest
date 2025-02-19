package onboardlearning.designpattern.strategypattern;

public class ShareStrategy {
    PhoneCameraApp share;
    public ShareStrategy(PhoneCameraApp obj){
        this.share=obj;
    }

    public void photos() {
        share.share();
    }
}
