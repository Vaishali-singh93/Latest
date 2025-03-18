package functionaltest.java8practise;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionalInterfaceExercise {
  @Test(description = "Validation of BiFunction")
    public void biFunctionValidations(){

      Map<Product,Integer> cart = new HashMap<Product,Integer>();
      cart.put(new Product("television","electronic","standard",2000),10);
      cart.put(new Product("shirt","Apprael","standard",1000),200);
      cart.put(new Product("washing machine","electronic","premium",900),20);
      cart.put(new Product("sofa","furniture","standard",4000),5);

      System.out.println('\n' +"-------write a Bifunction to create a product.------------");
      BiFunction<String,Integer,Product> fun = Product::new;
      System.out.println(fun.apply("Fridge",4800));

      System.out.println('\n' +"-------write a BiFunction to calculate the cost of products,Given the cart, calculate the cost of the cart.------------");
      BiFunction<Integer,Integer,Integer> fun2 = (a,b)-> a*b;
      System.out.println("Cost of product");
      cart.forEach((key,value)->System.out.println(fun2.apply(key.getPrice(),value)));
      System.out.println("cost of cart");
      System.out.println(cart.entrySet().stream().mapToInt((k)->fun2.apply(k.getKey().getPrice(), k.getValue())).sum());
  }
}
