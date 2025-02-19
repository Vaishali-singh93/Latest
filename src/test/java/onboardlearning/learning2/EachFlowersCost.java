package onboardlearning.learning2;

import constants.FlowersPrice;


public class EachFlowersCost {

    public int totalRosesCost(int totalRose){
        return totalRose * FlowersPrice.Per_Rose_Cost;
    }

    public int totalJasminesCost(int totalJasmines){
        return totalJasmines * FlowersPrice.Per_Jasmines_Cost;
    }

    public int totalLillysCost(int totalLillys){
        return totalLillys * FlowersPrice.Per_Lillys_Cost;
    }
}
