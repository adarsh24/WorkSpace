package Practice;

public class gridWay {

    public static int  findway(int n,int m ,int row,int col){
        // base case
        if(row == n-1 && col == m-1){
            return 1;
        }
        else if(row == n || col == n){
            return 0;
        }
        //right way
       // findway(arr,row,col+1);
       // finsway(arr,row+1,col);
       return findway(n,m,row,col+1) + findway(n,m,row+1,col);

    }
    public static void main(String agrs){
        int n= 3;
        int m = 3;

        System.out.print(findway(n,m,0,0));
    }
}
