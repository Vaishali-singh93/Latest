package onboardlearning.designpattern.factorypattern;

public class MyFirefoxDriverWithCapabilities implements WebDriverCapabilities {

    @Override
    public void getDriver() {
        System.out.println("get firefox capabilities");
    }
}
