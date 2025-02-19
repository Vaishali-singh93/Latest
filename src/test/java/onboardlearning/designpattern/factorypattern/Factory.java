package onboardlearning.designpattern.factorypattern;

public interface Factory {
    WebDriverCapabilities getCapability(String driverType);
}
