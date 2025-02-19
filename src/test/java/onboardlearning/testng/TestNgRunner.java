package onboardlearning.testng;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.Arrays;

public class TestNgRunner {
    public static void main(String[] args) {
        TestNG ng = new TestNG();
        ng.setTestSuites(Arrays.asList("C:\\Users\\Vaishali_Singh\\IdeaProjects\\onboarding-grow-program90\\testngjava8.xml"));
        ng.run();
    }
}
