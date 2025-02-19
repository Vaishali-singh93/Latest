package functionaltest.seleniumtestng;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;
public class Listeners implements ITestListener {
    @Override
public void onTestSuccess(ITestResult result){

        System.out.println("Test case success");

}
@Override
public void onTestFailure(ITestResult result){

        System.out.println("Test case Failed");
    }
}
