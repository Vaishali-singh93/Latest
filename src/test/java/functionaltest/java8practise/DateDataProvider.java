package functionaltest.java8practise;
import org.testng.annotations.DataProvider;
import java.time.LocalDate;

public class DateDataProvider {

    @DataProvider(name="dates")
    public Object[][] dates()
    {
        return new Object[][] {
                {LocalDate.of(2021,6,24)},
                {LocalDate.of(2000,8,27)},
                {LocalDate.of(2021,7,30)},
                {LocalDate.now()}

        };
    }
}
