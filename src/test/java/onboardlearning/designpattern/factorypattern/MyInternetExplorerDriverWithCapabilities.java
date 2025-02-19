package onboardlearning.designpattern.factorypattern;

public class MyInternetExplorerDriverWithCapabilities implements WebDriverCapabilities {

    @Override
    public void getDriver() {
        System.out.println("start internet explorer capability");
    }
}
