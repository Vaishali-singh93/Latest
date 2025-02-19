package functionaltest.java8practise;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class StreamsExercise {

    @Test(description = "Streams validations")
    public void streamValidations(){

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product("television","electronics","standard",20000));
        productList.add(new Product("shirt","Apprael","standard",400));
        productList.add(new Product("sofa","furniture","standard",40000));
        productList.add(new Product("fridge","electronics","standard",10000));
        productList.add(new Product("rice","grocery","food",100));
        productList.add(new Product("washing machine","Electronics","standard",500));

        System.out.println("---Exercise 1: From the given list of the products get all the products with price > 1000/----"+'\n');
        productList.stream().filter(p->p.getPrice()>1000).forEach(System.out::println);


        System.out.println('\n'+"---Exercise 2: list of the products get all the products from electronics category.----"+'\n');
        productList.stream().filter(p->p.getCategory().equalsIgnoreCase("electronics")).forEach(System.out::println);


        System.out.println('\n'+"---Exercise 3: get all the products with price> 1000/- and from electronics category " +
                "Change the name of the result list into CAP letters before printing----"+'\n');
        productList.stream().filter(p->p.getCategory().equalsIgnoreCase("electronics") && p.getPrice()>1000).
                forEach(p->System.out.println(p.getName().toUpperCase()+" "+p.getPrice()+" "+p.getCategory()));


        System.out.println('\n'+"---Exercise 4:Calculate the count of all electronic products in the given list of products.  ---");
        System.out.println(productList.stream().filter(p->p.getCategory().equalsIgnoreCase("electronics")).count());



    }
}
