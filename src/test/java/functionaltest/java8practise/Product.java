package functionaltest.java8practise;

public class Product {

    private String name;
    private int price;
    private String category;
    private String grade;

    public Product(String name,String category,String grade,int price){
        super();
        this.name=name;
        this.category=category;
        this.grade=grade;
        this.price=price;
    }

    public Product(String name, int price) {
        this.name=name;
        this.price=price;
    }




    public String getGrade() {
        return grade;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", grade=" + grade +
                '}';
    }


}
