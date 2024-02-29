package Practice;

public class recusion {

    public static void printBinString(int n,int lastPlace,String str){
        //base case
        if(n == 0){
            System.out.print(str+" ");
            return;
        }
        // kaam
        printBinString(n-1,0,str+"0");

        if(lastPlace == 0){
             printBinString(n-1,1,str+"1");
        }
    }
    public static void main(String args[]){
        printBinString(4,0,"");

    }
}
