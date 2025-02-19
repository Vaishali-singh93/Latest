package onboardlearning.collections;

import java.util.Comparator;

public class CheckerHM2 implements Comparator<PlayerHM2> {
    @Override
    public int compare(PlayerHM2 o1, PlayerHM2 o2) {
        int score1 = o1.getScore();
        int score2 = o2.getScore();
        if(score1>score2) {
            return -1;
        } else if (score1<score2) {
            return 1;
        } else {
            return o1.getName().compareTo(o2.getName());
        }

    }
}
