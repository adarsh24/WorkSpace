package Practice;
public class practice {
    public static void main(String args[]){
        String str = "1234";
      
        for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           int ans = ch-'0';
           System.out.println(ans);
        }
       
    }
}
