package mywork.collection;

import java.util.List;

public record Game(List<Card2> cards,List<Player> players) {

    public void setCardsOnPlayers(List<Card2> cards,List<Player> players){
        for(Player p : players){

        }
    }
}
