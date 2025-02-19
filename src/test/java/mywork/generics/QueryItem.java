package mywork.generics;

import java.util.ArrayList;
import java.util.List;

public class QueryItem <T extends QueryList> {
    private List<T> list;

    public QueryItem(List<T> list) {
        this.list = list;
    }

    public  List<T> allMatch(String field,String value){
        List<T> match = new ArrayList<>();
        for(var c : list){
            c.matchValue(field,value);
            match.add(c);
        }
        return match;
    }
}
