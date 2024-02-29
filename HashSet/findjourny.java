package HashSet;
 import java.util.*;
public class findjourny {

    public static String getStart(HashMap<String,String>ticket ){
        HashMap<String,String> revmap = new HashMap<>();

        for (String key : ticket.keySet()) {
            revmap.put(ticket.get(key),key);
        }
    }
    public static void main(String args[]){
        HashMap<String,String>ticket  = new HashMap<>();

        ticket.put("chennai","Bengaluru");
        ticket.put("mumbai","Delhi");
        ticket.put("Goa","Chennai");
        ticket.put("Delhi","Goa");
    }
}
