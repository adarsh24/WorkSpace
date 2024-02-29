package Recursion;

public class sortArr {

    public static boolean isSort(int arr[],int n){
        
        if(n == arr.length-1) return true;
        
         if(arr[n] <= arr[n+1])
         isSort(arr,n+1);
    
         return false;      
    }

    public static List TargetIdx(int arr[],int target,ArrayList<Integer> list)
    public static void main(String args[]){
        int arr[] = {1,2,3,4,3,9,7,8};

        System.out.print(TargetIdx(arr,0,new ArrayList<Integer > list));
    }
    
}
