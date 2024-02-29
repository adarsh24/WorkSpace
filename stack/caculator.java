package stack;
import java.util.Stack;
public class caculator {
    public static void main(String args[]){
        String str = "(1+(4+5+2)-3)";
        Stack<Integer> s= new Stack<>();
   int ans = 0,store=0;
        for(int i=0;i<str.length();i++){
             if(str.charAt(i) == ')'){
                 while(!isEmpty() && str.charAt(s.peek()) != '('){

                    if(str.charAt(s.peek())== '0' || str.charAt(s.peek())== '1' || str.charAt(s.peek())== '2'
                    || str.charAt(s.peek())== '3' || str.charAt(s.peek())== '4' || str.charAt(s.peek())== '5'
                    || str.charAt(s.peek())== '6' || str.charAt(s.peek())== '7' || str.charAt(s.peek())== '8'
                    || str.charAt(s.peek())== '9'){
                    char ch = str.charAt(s.peek());
                    store = ch - '0';
                   s.pop();
                    }
                    if(str.charAt(s.peek()) == '+'){
                        ans+=store;
                        s.pop();
                        System.out.println(ans);
                    }
                 }
             }  
           
             
            if(str.charAt(i) == ')'){
                  continue;
                }
                else{
                    s.push(i);
                    // System.out.print(str.charAt(s.peek()));
                }
            
        }
    }

    private static boolean isEmpty() {
        return false;
    }

    
    
}
