package Heap;

 import java.util.*;

public class insertHeap {
    static class Heap{
     ArrayList<Integer> arr = new ArrayList<>();

 public void insert(int data){
        arr.add(data);

  int x = arr.size()-1;
  int par = (x-1)/2;
  
  while(arr.get(x) < arr.get(par)){
        int temp = arr.get(x);
        arr.set(x,arr.get(par));
        arr.set(par,temp);

        x = par;
        par = (x-1)/2;
     }
    }


       public int peek(){
           return arr.get(0);
       }

    private void Heapify(int idx){

        int left = 2*idx + 1;
        int right = 2*idx + 2;
         int minIdx = idx;

         if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
            minIdx = left;
         }

         if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
            minIdx = right;
         }

          if(minIdx != idx){
            //swap
            int temp = arr.get(idx);
            arr.set(idx,arr.get(minIdx));
            arr.set(minIdx,temp);

            Heapify(minIdx);
          }

       }

       public  int remove(){
             int data = arr.get(0);
             // step 1 swap first and last

             int temp = arr.get(0);
             arr.set(0,arr.get(arr.size()-1));
             arr.set(arr.size()-1,temp);
             
          // delete last
          arr.remove(arr.size()-1);

          // heapify
             Heapify(0);
             return data;
       }

       public boolean isEmpty(){
          return arr.size() == 0;
       }


    public void add(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    }
    public static void main(String args[]){
    Heap h = new Heap();
    h.add(3);
    h.add(1);
    h.add(4);
    h.add(5);
   // h.add(2);

    while(!h.isEmpty()){
        System.out.println(h.peek());
        h.remove();
    }
    }
}
