package BST;
import java.util.*;
public class BuildBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){
        //base case
        if(root == null){
            root = new Node(val);
            return root;
        }
        // left subtree
        if(root.data > val){
            root.left = insert(root.left,val);
        }
        else{
            //right subtree
            root.right = insert(root.right,val);
        }

        return root;
    }

    public static void inOrder(Node root){
        if(root == null) return;
       

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static Node delete(Node root,int key){

        if(root.data > key){
            root.left = delete(root.left,key);
        }
        else if(root.data < key){
            root.right = delete(root.right,key);
        }
        else{
            // case 1 leaf Node 
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2 single child
           else if(root.left == null){
                root.right = delete(root.right,key);
            }
           else if( root.right == null){
                root.left = delete(root.left,key);
            }
           else{
            // case 3 two child

            Node Is = findsuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right,Is.data);
           }
          
        }
        return root;

    }

    public static Node findsuccessor(Node root){

        while(root.left != null){
           root = root.left; 
        }
        return root;
    }

    public static void PrintRange(Node root,int n1,int n2){

        if(root == null) return;

        if(root.data >= n1 && root.data <= n2){
            PrintRange(root.left,n1,n2);
            System.out.print(root.data+" ");
            PrintRange(root.right,n1,n2);
        }
       else if(root.data < n1){
            PrintRange(root.left,n1,n2);
        }

        else{
            PrintRange(root.right,n1,n2);
        }
    }

    public static void printpath(ArrayList<Integer> path){

        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }

    public static void Root2LeafPath(Node root,ArrayList<Integer> path){
        if(root == null ) return;

        path.add(root.data);

     if(root.left == null && root.right == null){
        printpath(path);
     }
       
          Root2LeafPath(root.left,path);
          Root2LeafPath(root.right,path);
          path.remove(path.size()-1);
         
    }
public static boolean isvalidate(Node root,Node minValue,Node maxValue){
        if(root == null) return true;

        if(minValue != null && root.data <= minValue.data ){
            return false;
        }
        else if(maxValue != null && root.data >= maxValue.data){
            return false;
        }
        return isvalidate(root.left,minValue,root) && isvalidate(root.right,root,maxValue);
    }

    public static Node mirrorImage(Node root){
        if(root == null) return null;

        Node leftsubtree = mirrorImage(root.left);
        Node rightsubtree = mirrorImage(root.right);

        root.left = rightsubtree;
        root.right = leftsubtree;

        return root;
    }

    public static void preOrder(Node root){

        if(root == null ) return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main (String args[]){
        int arr[] = {8,5,10,3,6,11,14};
        Node root = null;
        for(int i=0;i< arr.length;i++){
            root = insert(root,arr[i]);
        }
     // ArrayList<Integer> path = new ArrayList<>();
        inOrder(root);
        System.out.println();
       root =  mirrorImage(root);
        preOrder(root);
      
    }
}
