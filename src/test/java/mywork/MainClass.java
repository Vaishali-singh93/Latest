package mywork;
record Person(String name){
    @Override
    public String toString() {
        return "name is %s".formatted(name);
    }
}
public class MainClass {
    public static void main(String[] args) {
//        Customer cus = new Customer();
//        System.out.println(cus.getName());
//        System.out.println(cus.getCreditLimit());
//        System.out.println(cus.getAddress());
        var g = new Interface1() {
            @Override
            public void run() {

            }
        };

    }
}
