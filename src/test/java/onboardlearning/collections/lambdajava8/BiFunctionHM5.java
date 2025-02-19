package onboardlearning.collections.lambdajava8;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionHM5 {

    @Test
    public  void biFunctionValidation() {
        Map<Product,Integer> cart = new HashMap<Product,Integer>();
        cart.put(new Product("television","electronic","standard",2000),10);
        cart.put(new Product("shirt","Apprael","standard",1000),200);
        cart.put(new Product("washing machine","electronic","premium",900),20);
        cart.put(new Product("sofa","furniture","standard",4000),5);

        System.out.println('\n' +"-------write a Bifunction to create a product.------------");
        BiFunction<String,Integer,Product> bi = Product::new;
        System.out.println(bi.apply("fridge",20000));

        System.out.println('\n' +"-------write a BiFunction to calculate the cost of products,Given the cart, calculate the cost of the cart.------------");
        BiFunction<Integer,Integer,Integer> bfun = (a,b)->a*b;
        System.out.println(cart.entrySet().stream().mapToInt((k)->bfun.apply(k.getKey().getPrice(),k.getValue())).sum());
    }
}
