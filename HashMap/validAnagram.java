package HashMap;
  import java.util.*;
public class validAnagram {
    public static void main(String args[]){
        String str = "knee";
        String str1 = "eke";

        HashMap<Character,Integer> hp = new HashMap<>();
        HashMap<Character,Integer> hp1 = new HashMap<>();
        for(int i=0;i<str.length();i++){
            hp.put(str.charAt(i),hp.getOrDefault(str.charAt(i),0)+1);
        }
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(hp.get(ch)!= null){
                if(hp.get(ch) == 1){
                    hp.remove(ch);
                }
                else{
                    hp.put(ch,hp.get(ch)-1);
                }
            }
            else{
            
             System.out.println("False");
             break;
            }
        }
       if(hp.isEmpty()){
        System.out.println("true");
       }
      
    }
}
