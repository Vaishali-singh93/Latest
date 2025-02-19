package onboardlearning.collections.lambdajava8;

import functionaltest.java8practise.Product;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierHM4 {

    @Test
    public void consumerSupplierTask() {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("television","electronic","standard",20));
        list.add(new Product("shirt","Apprael","standard",990));
        list.add(new Product("sofa","furniture","standard",43000));
        list.add(new Product("fridge","electronic","standard",18000));
        list.add(new Product("rice","grocery","food",60));
        list.add(new Product("washing machine","electronic","premium",900));

        System.out.println('\n' +"-------Exercise2: Consumer to update the grade of the product as 'Premium' if the price is > 1000/ print all of the products----------");
        Consumer<Product> con = p->p.setGrade("Premium");
        list.stream().filter(p->p.getPrice()>1000).forEach(a->con.accept(a));
        list.forEach(System.out::println);

        System.out.println('\n' +"-------Exercise3: Consumer to product to be suffixed with '*' if the price of product is > 3000/----------");
        Consumer<Product> con2 = p->p.setName("*"+p.getName());
        list.stream().filter(p->p.getPrice()>3000).forEach(a->con2.accept(a));
        list.forEach(System.out::println);

        System.out.println('\n' +"-------Exercise4:Print all the Premium grade products with name suffixed with '*'------------");
        Consumer<List<Product>> c = (List<Product> li)->{
            for(Product p:li) {
                if (p.getName().contains("*")) {
                    System.out.println(p);
                }
            }
        };
        c.accept(list);

        System.out.println('\n' +"-------Exercise1:Write a supplier to produce a random product------------");
        Random r = new Random();
        Supplier<Product> sup = ()->new Product("television","electronic","standard",r.nextInt(50));
        System.out.println(sup.get());

        System.out.println('\n' +"-------Exercise5:Write a supplier to produce a random OTP------------");
        Supplier<Integer> supp = ()-> new Random().nextInt(999999);
        System.out.println(supp.get());
    }

}
