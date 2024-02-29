package stack;

public class longJump2 {
    public static void main(String args[]){
        int arr[] = {2,3,1,1,4};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int ans = arr[i];
            int j=i;
            while(ans>0){
                 
                max = Math.max(max,arr[j+1]);
                j++;
                ans--;
            }
        }
    }
}
