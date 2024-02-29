package Heap;

 import java.util.*;
public class KthMaxfreq {
    static class pair implements Comparable<pair>{

        int val;
        int freq;

        public pair(int val,int freq){
            this.val = val;
            this.freq = freq;
        }

        @Override
        public int compareTo(pair p2){
            // ascending
            //return this.val-p2.val;
            //decending
            return p2.freq-this.freq;
        }
    }

    public static void main(String args[]){
        int arr[] = {1,1,1,2,2,3};
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(new pair(arr[i],))
        }
    }
}
