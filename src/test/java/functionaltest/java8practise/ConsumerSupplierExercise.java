package functionaltest.java8practise;

import functionaltest.lambdapractise.Person;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSupplierExercise {

    @Test(description = "Consumer Supplier Validations")
    public void consumerSupplierValidations(){

        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("television","electronic","standard",20));
        list.add(new Product("shirt","Apprael","standard",990));
        list.add(new Product("sofa","furniture","standard",43000));
        list.add(new Product("fridge","electronic","standard",18000));
        list.add(new Product("rice","grocery","food",60));
        list.add(new Product("washing machine","electronic","premium",900));


        System.out.println('\n' +"-------Exercise1: Consumer to update the grade of the product as 'Premium' if the price is > 1000/ print all of the products----------");
        Consumer<List<Product>> consumer=(List<Product> li)->{
            for(Product p:li){
                if(p.getPrice()>1000)
                    p.setCategory("Premium");
            }
        };
        consumer.andThen(p->System.out.println(p)).accept(list);


        System.out.println('\n' +"-------Exercise2:update the name of the product to be suffixed with '*' if the price of product is > 3000/ print all of the products------------");
        Consumer<List<Product>> consume =(List<Product> li)->{
            for(Product p:li){
                if(p.getPrice()>3000)
                    p.setName("*" + p.getName());
            }
        };
        consume.andThen(p->System.out.println(p)).accept(list);

        System.out.println('\n' +"-------Exercise3:Print all the Premium grade products with name suffixed with '*'------------");
        Consumer<List<Product>> con = (List<Product> li)->{
            for(Product p:li) {
                if (p.getGrade().equalsIgnoreCase("premium")) {
                    p.setName("*" + p.getName());
                    System.out.println(p);
                }
            }
        };
        con.accept(list);

        System.out.println('\n' +"-------Exercise4:Write a supplier to produce a random product------------");
        Supplier<Product> supplier = ()-> new Product("test","standard","test",123);
        System.out.println(supplier.get());

        System.out.println('\n' +"-------Exercise5:Write a supplier to produce a random OTP------------");
        Supplier<Integer> supp = ()-> new Random().nextInt(999999);
        System.out.println(supp.get());



    }

}
