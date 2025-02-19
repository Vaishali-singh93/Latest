package mywork.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var nationalPark = new Park[]{new Park(23465,"Jim corbit"),
                (new Park(9876,"Green park"))};
        Layer<Park> p = new Layer<>(nationalPark);
        p.renderLayer();
        var river = new River[]{new
                River(65437,"Gomti"),new River(98230,"Ganga")};
        Layer<River> r = new Layer<>(river);
        r.renderLayer();
        List<Integer> li = new ArrayList<>();
        for(var c:li){

        }
    }
}
