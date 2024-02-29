package stack;

public class gasStation {
    public static void main(String args[]){
        int gas[] = {1,2,3,4,5};
        int cost[] = {3,4,5,1,2};
        int ans = 0;
        for(int i=0;i< gas.length;i++){
            ans=cost[i];
              if(ans > gas[i]){
               for(int j=i;j<gas.length%i;j++){ 
                     ans = ans-gas[gas.length%j];
                     ans+=cost[gas.length%j];
               }
              }
        }
    }
}
