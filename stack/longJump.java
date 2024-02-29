package stack;

public class longJump {
    public static boolean LongJump(int arr[],int n){
        int i=0,sum = 0;
        while(i<n){
         
            int ans = arr[i];
             sum+=ans;
            i+=ans;
        }
        if(sum>= n-1){
            return true;
        }
        else{
            return false;
        }
       
        }
       
    
   public static void main(String args[]){
  int arr[] = {3,2,1,0,4};
        int n  = arr.length;
       System.out.print( LongJump(arr,n));
   } 
}
