package Heap;

 import java.util.*;
public class weakSoldiers {

      static class row implements Comparable<row>{

        int soldiers;
        int idx;

        public row(int soldiers,int idx){
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override

        public int compareTo(row r2){
            if(this.soldiers == r2.soldiers){
            return this.idx - r2.idx;
            }
            else{
                return this.soldiers - r2.soldiers;
            }
        }
      }
    public static void main(String args[]){
        int arr[][] = {{1,0,0,0},
                       {1,1,1,1},
                       {1,0,0,0},
                       {1,0,0,0}
                       };

             int k=2;             
         PriorityQueue<row> pq = new PriorityQueue<>(); 
         
         for(int i=0;i<arr.length;i++){
            int cnt = 0;
              for(int j=0;j<arr.length;j++){
                if(arr[i][j] == 1){
                  cnt++;
                }
              }
              pq.add(new row(cnt,i));
         }

          for(int i=0;i<k;i++){

            System.out.println("soldiers"+pq.peek().idx);
            pq.remove();
          }
    }
}
