package mywork.udemy;

import java.util.LinkedList;


record Place(String name,long distance)
{

}



public class ImplementingList {
    LinkedList<Place> place = new LinkedList<>();

    public static void main(String[] args) {
        LinkedList<Place> place = new LinkedList<>();
        addPlace(place,new Place("Sydney",1345));
        addPlace(place,new Place("versova",123));
        addPlace(place,new Place("Brisbane",678));
        addPlace(place,new Place("tok",78));
        System.out.println(place);

        if(place.get(2)!=null) {
           addPlace(place,new Place("India",876));
        }

        System.out.println("After"+"--".repeat(6)+place);



    }


    public static void addPlace(LinkedList<Place> list,Place place) {
        int i=0;
        for(Place p:list) {
            if (place.distance() < p.distance()) {
                list.add(i,place);
                return;
            }
            i++;
        }
        list.add(place);
    }




}


