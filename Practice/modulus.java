package Practice; 
public class modulus {
    public static void kokoEat(int arr[],int h){
        int min =Integer.MAX_VALUE;
  int n = arr.length;
  int max = Integer.MIN_VALUE;
  for(int i=0;i<n;i++){
        max = Math.max(max,arr[i]);
  }
 
   int start=1;
   int end = max;
   while(start < end){
  int mid = start + (end-start)/2;
   int sum = 0;
      for(int i=0;i<n;i++){
      sum+= arr[i]/mid;
   if(arr[i] % mid != 0) sum++; 
      }
      if(sum > h)
        start = mid+1;
      else if (sum <= h){
        end = mid-1;
      }
      else if(sum == h){
    min = Math.min(min,mid);
      }

   }
   System.out.print(min);
    }
    public static void main(String args[]){
int arr[] = {3,6,7,11};
int h = 8;
kokoEat(arr,h);
    }
}
