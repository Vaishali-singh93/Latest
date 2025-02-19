package functionaltest.javacollections;

import net.bytebuddy.utility.RandomString;
import org.testng.annotations.Test;

import java.util.*;


public class ListImplementation {

    @Test
    public void listdemo(){
        List<String> uuid = new ArrayList<String>();

        for(int i=0;i<5;i++){
            String id = UUID.randomUUID().toString();
            uuid.add(id);
        }
        System.out.println("Numbers in list are");
        for(String a:uuid)
            System.out.println(a);



       System.out.println("Numbers after sort");
        uuid.sort(Comparator.naturalOrder());
        for(String a:uuid)
            System.out.println(a);


        System.out.println("Remove id in index 2");
        uuid.remove(2);
        System.out.println(uuid);



    }


}
