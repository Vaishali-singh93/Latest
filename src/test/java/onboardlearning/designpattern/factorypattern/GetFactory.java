package onboardlearning.designpattern.factorypattern;

public class GetFactory {
    Factory web;
    GetFactory(Factory f){
        this.web=f;
    }

    public void getBrowser(String type) {
            web.getCapability(type).getDriver();

    }
}
