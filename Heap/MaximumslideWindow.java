package Heap;

  import java.util.*;
public class MaximumslideWindow {
    static class pair implements Comparable<pair>{

        int val;
        int idx;

        public pair(int val,int idx){
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(pair p2){
            // ascending
            //return this.val-p2.val;
            //decending
            return p2.val-this.val;
        }
    }

    public static void main(String args[]){
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int ans[] = new int[arr.length-k+1];
        PriorityQueue<pair> pq = new PriorityQueue<>();

        for(int i=0;i<k;i++){
            pq.add(new pair(arr[i],i));
        }

      ans[0] = pq.peek().val;

      for(int i=k;i<arr.length;i++){
        while(pq.size()>0 && pq.peek().idx <= i-k){
            pq.remove();
        }

        pq.add(new pair(arr[i],i));
        ans[i-k+1] = pq.peek().val;
      }
      for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
      }
      System.out.println();
    }
}
