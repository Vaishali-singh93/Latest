package onboardlearning.collections;

import java.util.*;

public class SolutionHM1 {

    public static void main(String[] args) {
        ArrayList<PlayerHM2> ar = new ArrayList<PlayerHM2>();
        String name;
        int score;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of player");
        int number = sc.nextInt();
        for(int i=1;i<=number;i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("enter name");
            name=sc1.nextLine();
            System.out.println("enter score");
            score=sc1.nextInt();
            ar.add(new PlayerHM2(score,name));
        }

        Collections.sort(ar,new CheckerHM2());
        ar.forEach(a-> System.out.println("score"+a.getScore()+"  "+a.getName()));

    }
}
