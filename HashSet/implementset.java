package HashSet;

import java.util.*;

public class implementset {
     public static void main(String args[]){
    HashSet<Integer> set = new HashSet<Integer>();

    set.add(1);
    set.add(2);
    set.add(2);
    set.add(4);
    set.add(1);
    //System.out.println(set);

    if(set.contains(2)){
        System.out.println("set contain 2");
    }
    else{
        System.out.println("set  not contain 2");
    }
   }
}
