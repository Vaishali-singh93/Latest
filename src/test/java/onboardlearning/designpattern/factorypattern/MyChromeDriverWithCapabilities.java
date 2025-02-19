package onboardlearning.designpattern.factorypattern;

public class MyChromeDriverWithCapabilities implements WebDriverCapabilities {

    @Override
    public void getDriver() {
        System.out.println("start chrome capability");
    }
}
