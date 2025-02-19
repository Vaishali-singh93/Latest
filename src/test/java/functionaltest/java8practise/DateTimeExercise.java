package functionaltest.java8practise;
import org.testng.annotations.Test;
import java.time.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class DateTimeExercise {



    @Test(description = "Date time validations",dataProvider = "dates",dataProviderClass = DateDataProvider.class)
    public void yesterdayDateValidations(LocalDate date) {

        System.out.println('\n' + "-------Exercise 1: apredicate to check if the given date is yesterday date--------");
        Predicate<LocalDate> predicate = i->i.isEqual(LocalDate.now().minusDays(1));
        System.out.println(date);
        System.out.println(predicate.test(date));

        System.out.println('\n' + "-------Exercise 2:  Supplier to get Date for next Thursday--------");
        Supplier<LocalDate> supplier=()->date.with(DayOfWeek.THURSDAY).plusDays(7);
        System.out.println(supplier.get());


    }

    @Test(description = "validations")
    public void dateValidations() {

        System.out.println('\n' + "-------Exercise 3:Supplier to get CurrentTime in EST timezone--------");
        Supplier<LocalTime> supplier=()-> LocalTime.now(ZoneId.of("US/Eastern"));
        System.out.println(supplier.get());

        System.out.println('\n' + "-------Exercise 4:Function to calculate the age of a person given date of birth. --------");
        /*Supplier<Period> supplier4=()-> Period.between(LocalDate.of(2000,8,27),LocalDate.now());
        System.out.println(supplier4.get());*/

        Consumer<LocalDate> consume =(date)->{
            Period p = Period.between(date,LocalDate.now());
            System.out.println(" Age is: "+p.getYears()+" Years "+p.getMonths()+" Months "+p.getDays()+" Days");
        };
        consume.accept(LocalDate.of(2000,8,27));

    }


}
