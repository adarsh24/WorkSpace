package BST;
import java.util.*;
public class convertBSTtobalanceBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
           this.right = null;
        }
    }

    public static ArrayList inOrder(Node root,ArrayList<Integer> list){

        if(root == null) return list;

        inOrder(root.left,list);
          list.add(root.data);
        inOrder(root.right,list);

     return list;
    }

    public static void preOrder(Node root){
        if(root == null) return;

       System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node createBST(ArrayList<Integer> list2,int start,int end){
        if(start > end) return null;
 
     int mid = (start+end)/2;
     Node root = new Node(list2.get(mid));
 
     root.left = createBST(list2,start,mid-1);
     root.right = createBST(list2,mid+1,end);
 
     return root;
 
 
     }

     public static Node  BalanceBST(Node root){
        // find inOrder
        ArrayList<Integer> list  = new ArrayList<>();
            inOrder(root,list);
        // create BST
         root = createBST(list,0,list.size()-1);
         return root;
     }
     public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);
        root.left.left =  new Node(5);
        root.right.right = new Node(11);
        root.left.left.left = new Node (3);
        root.right.right.right = new Node(12);

       Node root1 =  BalanceBST(root);
       preOrder(root1);


     }
}
