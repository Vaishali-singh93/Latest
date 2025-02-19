package onboardlearning.learning3;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewYearGift {

    List<GiftPackage> gift = new ArrayList<>();

    @BeforeMethod
    public void createListOfConfectioneries() {
       gift.add(new Sweets("swe1",10));
       gift.add(new Sweets("swe1",10));
       gift.add(new Sweets("swe2",17));
       gift.add(new Chocolate("cho1",28));
       gift.add(new Chocolate("cho2",23));
       gift.add(new Candies("can1",12));
       gift.add(new Candies("can2",40));
       gift.add(new Candies("cho2",23));

    }

    @Test
    public void validateTotalWeightOfGift() {
        System.out.println(gift.stream().mapToInt(GiftPackage::getWeight).sum());
    }

    @Test
    public void sortCholocates() {
       gift.stream().filter(m->m.getName().contains("cho"))
               .map(GiftPackage::getWeight).sorted().forEach(System.out::println);
    }

    @Test
    public void IdentifyCandiesInGift() {
        System.out.println(gift.stream().filter(m->m.getName().contains("can")).count());
    }
}
