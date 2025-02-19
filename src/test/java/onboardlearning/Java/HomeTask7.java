package onboardlearning.Java;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class HomeTask7 {

    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile",System.getProperty("user.dir")+"\\src\\test\\resources\\log4j2.xml");
        Logger logger = LogManager.getRootLogger();
        logger.info("info");
        logger.warn("warning");
        logger.error("error message");

    }
}
