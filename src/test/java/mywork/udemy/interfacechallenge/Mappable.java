package mywork.udemy.interfacechallenge;

public interface Mappable {

    String JSON_PROPERTY= """
            "properties":{%s}
            """;
   String label();
   String geometoryType();
   String iconType();
    default String toJson(){

        return """
                "type":"%s","label":"%s","marker":"%s"
                """.formatted(geometoryType(),label(),iconType());
    }

   static void printProperties(Mappable mappable){
        System.out.printf(JSON_PROPERTY.formatted(mappable.toJson()));
    }


}
