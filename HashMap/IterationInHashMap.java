package HashMap;

import java.util.*;

public class IterationInHashMap {
    public static void main(String args[]){
        HashMap<String,Integer> map = new  HashMap<String,Integer>();

        map.put("India",150);
        map.put("china",160);
        map.put("nepal",10);
        map.put("indonesia",50);
        map.put("U.S",120);

        // Iterate
        Set<String> keys = map.keySet();
       //  System.out.println(keys);

        for (String  k  : keys) {
            System.out.println("Key="+k+",value="+map.get(k));
        }
}
}
