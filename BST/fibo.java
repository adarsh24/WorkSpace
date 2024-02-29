package BST;

import java.util.ArrayList;

public class fibo {

    public static int Fibo(int n){
        if(n == 1 || n == 0) return n;
        return Fibo(n-1)+Fibo(n-2);
    }

    public static void naturalNo(int n){
        if(n==0) return;
        System.out.print(n+" ");
        naturalNo(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        if(n== 1)return 1;
        return n* fact(n-1);
    }

    public static void sumOfdigit(int n){
        if(n<=0)return ;  
       
    System.out.print(n%10);
          sumOfdigit(n/10);
    }

    private static int helper(int n,int ans){
     if(n==0){
        return ans;
     }
     if(n%10 == 0) return helper(n/10,ans+1);
     return helper(n/10,ans);
    }
   public static int Countzero(int n){

   return helper(n,0);
   }

   

  public static boolean search(int arr[],int target,int idx){
      
    if(idx == arr.length) return false;
      
    return target == arr[idx] || search(arr,target,idx+1);
      }

      public static void triangle(int row,int col){
         if(row == 0) return;
         if(col < row){
            System.out.print("*");
            triangle(row,col+1);
         }
         else{
            System.out.println();
            triangle(row-1,0);
         }
      }
    public static void main(String args[]){
        int arr[] = {3,4,5,6,7,8};
       
        triangle(4,0);
       
    }
}
