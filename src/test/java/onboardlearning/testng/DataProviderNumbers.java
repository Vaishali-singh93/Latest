package onboardlearning.testng;

import org.testng.annotations.DataProvider;

import java.time.LocalDate;

public class DataProviderNumbers {

    @DataProvider(name="getData")
    public Object[][] getData() {

        return new Object[][] {
                {30,-10},
                {10,10}
        };
    }
}
