package onboardlearning.designpattern.factorypattern;

public class DriverFactory implements Factory{
    public WebDriverCapabilities getCapability(String driverType) {
        if(driverType==null)
            return null;
        else if(driverType.equalsIgnoreCase("chrome"))
            return new MyChromeDriver();
        else if (driverType.equalsIgnoreCase("firefox")) {
            return new MyFirefoxDriver();
        } else if (driverType.equalsIgnoreCase("internetexplorer")) {
            return new MyInternetExplorerDriver();
        }
        return null;
    }
}
