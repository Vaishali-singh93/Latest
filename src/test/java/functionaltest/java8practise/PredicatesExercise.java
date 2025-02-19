package functionaltest.java8practise;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.ArrayList;
/*
Used Predicates in Stream().filter
 */

public class PredicatesExercise {


    @Test(description = "Validation on Product class")
    public void productValidation(){

        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("television","electronic","standard",20));
        list.add(new Product("shirt","Apprael","standard",990));
        list.add(new Product("sofa","furniture","standard",43000));
        list.add(new Product("fridge","electronic","standard",18000));
        list.add(new Product("rice","grocery","food",60));
        list.add(new Product("washing machine","electronic","standard",15000));

        System.out.println("-------Exercise1: Products less than 1000 price range---------");
        list.stream().filter(p->p.getPrice()<1000).forEach(System.out::println);

        System.out.println('\n'+ "----------Exercise2: Check if product is electronic category---------");
        list.stream().filter(p->p.getCategory().equalsIgnoreCase("electronic")).forEach(System.out::println);


        System.out.println('\n'+ "----------Exercise3: print all products price greater than 100/- which are in electronics category---------");
        list.stream().filter(p->p.getPrice()>100 && p.getCategory()=="electronic").forEach(System.out::println);


        System.out.println('\n'+ "----------Exercise4: print all products price greater than 100/- or in electronics category---------");
        list.stream().filter(p->p.getPrice()>100 || p.getCategory().equalsIgnoreCase("electronic")).forEach(System.out::println);

        System.out.println('\n'+ "----------Exercise5: print all products price less than 100/- and product is in electronics category---------");
        list.stream().filter(p->p.getPrice()<100 && p.getCategory().equalsIgnoreCase("electronic")).forEach(System.out::println);
    }

    @Test(description = "Validation on Response class")
    public void responseValidation(){
        JSONObject request = new JSONObject();
        request.put("Id","7867890");
        request.put("message","Action Successful");

        JSONObject request2 = new JSONObject();
        request2.put("Id","7867893");
        request2.put("message","Action Not Success");

        JSONObject request3 = new JSONObject();
        request3.put("Id","7867896");
        request3.put("message","Action Not Success");

        ArrayList<Response> list = new ArrayList<>();
        list.add(new Response(request.toString(),200,"JSON"));
        list.add(new Response(request2.toString(),400,"JSON"));
        list.add(new Response("Note_finishes",400,"text"));
        list.add(new Response("Confidential",401,"pdf"));
        list.add(new Response(request3.toString(),400,"json"));

        System.out.println('\n'+ "----------Exercise6:Print all the responses with status code 400 from the given list of responses.---------");
        list.stream().filter(p->p.getStatusCode()==400).forEach(System.out::println);

        System.out.println('\n'+ "----------Exercise7: Print all the responses the response type JSON from the given list of responses.---------");
        list.stream().filter(p->p.getResponseType().equalsIgnoreCase("json")).forEach(System.out::println);

        System.out.println('\n'+ "----------Exercise8:Print all the responses with status code 400 and response type JSON---------");
        list.stream().filter(p->p.getResponseType().equalsIgnoreCase("json") && p.getStatusCode()==400).forEach(System.out::println);

        System.out.println('\n'+ "----------Exercise9:Print all the responses with status code 400 or response type JSON---------");
        list.stream().filter(p->p.getResponseType().equalsIgnoreCase("json") || p.getStatusCode()==400).forEach(System.out::println);

        System.out.println('\n'+ "----------Exercise10:Print all the responses with status code is not 400 and response type JSON---------");
        list.stream().filter(p->p.getResponseType().equalsIgnoreCase("json") && p.getStatusCode()!=400).forEach(System.out::println);







    }
}
