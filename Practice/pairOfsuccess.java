package Practice;

public class pairOfsuccess {
    public static void findsuccess(int arr[],int arr1[],int k){
        int temp[] = new int[arr.length];
           for(int i=0;i<arr.length;i++){
            int cnt=0;
            for(int j=0;j<arr1.length;j++){
                 if(arr[i]*arr1[j] >= k){
                    cnt++;
                 }
            }
            temp[i] = cnt;
           }
           for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
           }
    }
    public static void main(String args[]){
        int arr[] = {3,1,2};
        int success = 16;
        int arr1[] = {8,5,8};

        findsuccess(arr,arr1,success);
    }
}
