package Practice;
public class transpose {
    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,5,6}};
        int output[][] = new int[arr[0].length][arr.length];

        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[0].length;j++){
            output[j][i] = arr[i][j];
           }
        }
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(output[i][j]);
            }
        }
    }
}
