package functionaltest.java8practise;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;

public class FunctionalInterfaceExercise {




    @Test(description = "Functional Interface validation")
    public void functionalInterfaceValidations(){
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("television","electronic","standard",20000));
        list.add(new Product("shirt","Apprael","standard",400));
        list.add(new Product("sofa","furniture","standard",40000));
        list.add(new Product("fridge","electronic","standard",10000));
        list.add(new Product("rice","grocery","food",100));
        list.add(new Product("washing machine","electronic","standard",500));

        System.out.println("+".repeat(30));
        list.sort(Comparator.comparing(Product::getPrice).reversed());
        list.forEach(a-> System.out.println(a.getPrice()));


        System.out.println('\n' + "-------Exercise1: calculate the cost of all products in a given list of products---------");
        System.out.println(list.stream().mapToInt(p->p.getPrice()).sum());

        System.out.println('\n' +"-------Exercise2:calculate the cost of all products whose prices is > 1000/- in the given list of products---------");
        System.out.println(list.stream().filter(p->p.getPrice()>1000).mapToInt(p->p.getPrice()).sum());

        System.out.println('\n' +"-------Exercise3:calculate the cost of all electronic products in the given list of products---------");
        System.out.println(list.stream().filter(p->p.getCategory().equalsIgnoreCase("electronic")).mapToInt(p->p.getPrice()).sum());


        System.out.println('\n' +"-------Exercise4:products whose price is is > 1000/- and belongs to electronic category---------");
        System.out.println(list.stream().filter(p->p.getCategory().equalsIgnoreCase("electronic") && p.getPrice()>1000)
                .mapToInt(p->p.getPrice()).sum());

    }


}
