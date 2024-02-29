package HashMap;
  import java.util.*;
public class createHashMap {
    
    public static void main(String args[]){
        HashMap<String,Integer> map = new  HashMap<String,Integer>();

        map.put("India",150);
        map.put("china",160);
        map.put("nepal",10);
        map.put("indonesia",50);
        map.put("U.S",120);

    //     System.out.println(map);
    //     int population = map.get("India");
    //     System.out.println(population);

    //     // containKey

    //    System.out.println( map.containsKey("canada"));

    map.remove("India");
    System.out.println(map);
    }
}
