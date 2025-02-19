package onboardlearning.designpattern.factorypattern;

public class CapabilityFactory implements Factory {
    public WebDriverCapabilities getCapability(String browserName) {
        if(browserName==null)
            return null;
        if(browserName.equalsIgnoreCase("chrome capability"))
            return new MyChromeDriverWithCapabilities();
        else if (browserName.equalsIgnoreCase("internerexplorer capability")) {
            return new MyInternetExplorerDriverWithCapabilities();
        } else if (browserName.equalsIgnoreCase("firefox capability")) {
            return new MyFirefoxDriverWithCapabilities();
        }

        return null;
    }
}
