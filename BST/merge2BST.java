package BST;

 import java.util.*;
public class merge2BST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static void inOrder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;

        }
        inOrder(root.left ,list);
        list.add(root.data);
        inOrder(root.right,list);
    }

    public static Node createBST(ArrayList<Integer> list2,int start,int end){
        if(start > end) return null;
 
     int mid = (start+end)/2;
     Node root = new Node(list2.get(mid));
 
     root.left = createBST(list2,start,mid-1);
     root.right = createBST(list2,mid+1,end);
 
     return root;

     }

public static Node mergeBST(Node root1,Node root2){

       ArrayList<Integer> list1 = new ArrayList<Integer>();
       ArrayList<Integer> list2 = new ArrayList<Integer>();
       ArrayList<Integer> mergelist = new ArrayList<Integer>();

        inOrder(root1,list1);
        inOrder(root2,list2);
        int j=0,i=0;
        while(i  < list1.size() && j < list2.size()){
        if(list1.get(i) <= list2.get(j) ){
            mergelist.add(list1.get(i));
             i++;
        }
      
        else{
            mergelist.add(list2.get(j)); 
            j++;
        }
       }

       while(i< list1.size()){
        mergelist.add(list1.get(i));
        i++;
       }
       while(j< list2.size()){
        mergelist.add(list2.get(j));
        j++;
       }
   return  createBST(mergelist,0,mergelist.size()-1);
     }


     public static void preOrder(Node root){
        if(root ==null) return;

       System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
public static void main(String args[]){

      Node root1 = new Node(2);
      root1.left = new Node(1);
      root1. right = new Node(4);

      Node root2 = new Node(9);
      root2.left = new Node(3);
      root2.right = new Node(12);

    // Node root =   mergeBST(root1,root2);
    // preOrder(root);

}
}
