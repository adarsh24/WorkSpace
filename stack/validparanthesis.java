package stack;
import java.util.Stack;

public class validparanthesis {
    public static void main(String args[]){
        String str = "())()()";
      Stack<Integer> s = new Stack<>();
         int cnt=0;
      for(int i=0;i<str.length();i++){
      
         if( str.charAt(i) =='('){
            s.push(i);
         }
        else if(str.charAt(i) == ')'){
            s.pop();
           if(s.isEmpty()){
            s.push(i);
           }
           else{
            cnt = Math.max(cnt,i-s.peek());
           }
         }
        
         }
         System.out.println(cnt);
      }
      
    }

