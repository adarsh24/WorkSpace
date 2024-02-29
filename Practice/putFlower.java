package Practice;
public class putFlower {

    public static boolean flower(int arr[],int n){
        
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1] == 0 && arr[i+1] == 0){
                arr[i] = 1;
               n--;

            }
        }
        if(n == 0){
            return true;
        }
        else{
            return false;
        }

       
    }
    public static void main(String args[]){
        int arr[] = {1,0,0,0,0,1};
        int n = 2;
        System.out.print(flower(arr,n));
    }
}
