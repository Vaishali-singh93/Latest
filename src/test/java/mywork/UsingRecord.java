package mywork;

public class UsingRecord {

    public static void main(String[] args) {
        for(int i =1;i<=4;i++) {
            MyRecord m = new MyRecord("TS88" + i,switch (i) {
                case 1 -> "Vaishali";
                case 2 -> "shefali";
                case 3 -> "neha";
                case 4 -> "shruti";
                default -> "Anonymous";
            },"17/10/1991","Java Class");
            System.out.println(m);
        }
    }
}
