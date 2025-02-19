package onboardlearning.Java;


public class HomeTask3 {
    public static void generatePyramidWhileLoop(int number,int x) {
        int i = 1;
        int j = 0;

        while (i <= number) {
            int t=0;
            while (t<i) {
                System.out.print(x*j+"\t");
                j++;
                t++;
            }
            System.out.println("\n");
            i++;

        }
    }

    public static void generatePyramidDoWhileLoop(int number,int x) {
        int i = 1;
        int j = 0;
        do {
            int t=0;
            while (t<i) {
                System.out.print(x*j+"\t");
                j++;
                t++;
            }
            System.out.println("\n");
            i++;
        }
        while (i <= number) ;
    }

    public static void generatePyramidForLoop(int number,int x) {
        int j = 0;
        for(int i=1 ;i<= number;i++) {
            for(int t=0;t<i;t++) {
                System.out.print(x*j+"\t");
                j++;
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        for(int i=1;i<=3;i++) {
            HomeTask3.generatePyramidWhileLoop(5,i);
            HomeTask3.generatePyramidForLoop(5,i);
            HomeTask3.generatePyramidDoWhileLoop(5,i);
        }
    }
}
