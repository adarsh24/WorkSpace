
 import java.util.*;
public class QueueBy2stak {
    public static void main(String args[]){
        int arr[] = {1,2,3};

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for(int i=0;i<arr.length;i++){
            while( !s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(arr[i]); 
            
           while(!s2.isEmpty()){
            s1.push(s2.pop());
           }

          
        }

        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
}
