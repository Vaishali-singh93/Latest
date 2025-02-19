package onboardlearning.collections.lambdajava8;

import functionaltest.java8practise.Product;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInterfaceHM3 {

    @Test
    public void functionInterfaceValidation() {

        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("television","electronic","standard",20000));
        list.add(new Product("shirt","Apprael","standard",400));
        list.add(new Product("sofa","furniture","standard",40000));
        list.add(new Product("fridge","electronic","standard",10000));
        list.add(new Product("rice","grocery","food",100));
        list.add(new Product("washing machine","electronic","standard",500));

        Function<Product,Boolean> case1 = (a)-> {return a.getPrice()>1000;};
        Function<Product,Boolean>  case2 = (a)-> {return a.getCategory().equalsIgnoreCase("electronic");};

        System.out.println('\n' + "-------Exercise1: calculate the cost of all products in a given list of products---------");
        System.out.println(list.stream().mapToInt(Product::getPrice).sum());

        System.out.println('\n' +"-------Exercise2:calculate the cost of all products whose prices is > 1000/- in the given list of products---------");
        System.out.println(list.stream().filter(a->case1.apply(a)).mapToInt(Product::getPrice).sum());


        System.out.println('\n' +"-------Exercise3:calculate the cost of all electronic products in the given list of products---------");
        System.out.println(list.stream().filter(p->case2.apply(p)).mapToInt(p->p.getPrice()).sum());


        System.out.println('\n' +"-------Exercise4:products whose price is is > 1000/- and belongs to electronic category---------");
        System.out.println(list.stream().filter(p->case2.apply(p) && (case1).apply(p)).mapToInt(p->p.getPrice()).sum());

    }
}
