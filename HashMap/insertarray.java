package HashMap;
import java.util.*;

public class insertarray {
    public static void main(String args[]){
        int arr[] = {1,2,1,2,3,2,3,1,4,5};
   HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            if(map.containsKey(key)){
                int freq = map.get(key);
                freq++;
                map.put(key,freq);
            }
            else{
                map.put(key,1);
            }
        }
   Set<Integer> keys = map.keySet();
        for (Integer k : keys) {
            System.out.println(k+" "+map.get(k));
        }
    }
}
