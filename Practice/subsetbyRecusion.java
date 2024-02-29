package Practice;

public class subsetbyRecusion {
    public static void subset(String str,int i,String temp){
       
        // base case
        if(i == str.length()){
            System.out.println(temp); 
            return;
        }
        //kaam
          subset(str,i+1,temp+str.charAt(i));
        //NO
         subset(str,i+1,temp);

    }
    public static void main(String args[]){
        String str = "abc";

        subset(str,0,"");
    }
}
