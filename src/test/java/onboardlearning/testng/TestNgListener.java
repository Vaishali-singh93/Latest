package onboardlearning.testng;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;


public class TestNgListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("start---" +result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("success---" +result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("failed---"+result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("finish" +context.getName());
    }
}
