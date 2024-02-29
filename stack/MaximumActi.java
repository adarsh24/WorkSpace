package stack;
import java.util.*;
public class MaximumActi {
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
ArrayList<Integer> ans = new ArrayList<>();
        int maxActi = 1;
        int Maxend = end[0];
        ans.add(0);

        for(int i=1;i<end.length;i++){
            if(start[i] >= Maxend){
                maxActi++;
                Maxend = end[i];
                ans.add(i);
            }
        }
        System.out.println("Max activity is : "+ maxActi);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
