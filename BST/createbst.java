package BST;

import java.util.ArrayList;

public class createbst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
           
        }
    }

    public static Node insert(Node root,int val){
      if(root == null){
        root = new Node(val);
        return root;
      }
      if(root.data > val){
        // left subtree
        root.left = insert(root.left,val);
      }
      else{
        // right subtree
        root.right = insert(root.right,val);
      }
      return root;
    }


    public static Node delete(Node root, int key){

      if(root.data < key)
      root.right = delete(root.right,key);

      else if(root.data > key)
      root.left = delete(root.left,key);

      else{
        // case 1   leaf node
        if(root.left == null && root.right == null) return null;

        // case 2 one child
        if(root.left == null) 
             return root.right;

    else if( root.right == null)
            return root.left;

            // case 3 having two node
         Node IS = findInorderSuccessor(root.right);   
         root.data = IS.data;
         root.right = delete(root.right,IS.data);
      }
      return root;
    }

      public static Node findInorderSuccessor(Node root){
          while(root.left != null){
            root = root.left;
          }
          return root;
      }


      public static void printRange(Node root,int k1,int k2){

        if(root == null) return;
              
        if( root.data >= k1 && root.data <= k2){
          printRange(root.left,k1,k2);
          System.out.print(root.data+" ");
          printRange(root.right,k1,k2);
        }
        else if(root.data < k1){
          printRange(root.left,k1,k2);
        }
        else{
          printRange(root.right,k1,k2);
        }
      }
    public static void inorder(Node root){
        if(root == null)
        return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
 
     public static boolean search(Node root,int key){

      if(root == null) return false;

      if(root.data == key ) return true;

      if(root.data > key) return search(root.left,key);

        return search(root.right,key);

    
     }
    public static void printPath(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
    }

    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
        if(root == null) return;
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2Leaf(root.left,path);
        printRoot2Leaf(root.right,path);
        path.remove(path.size()-1);

    }
        public static int maximum(Node root){
            if(root == null) return 0;
            int x = maximum(root.left);
            int y = maximum(root.right);
            return Math.max(root.data,Math.max(x,y));
        }

        public static int minimum(Node root){
            if(root == null) return 0;
            int x = minimum(root.left);
            int y = minimum(root.right);
            return Math.min(root.data,Math.min(x,y));
        }
     public static boolean Isvalidate(Node root){
        int store = root.data;
        if(root == null) return false;

       
        int maxi = maximum(root.left);
        int mini = minimum(root.right);
        if(maxi < store && store< mini ) return true;
        return false;
     }

    public static void main(String args[]){
         int values[] = {5,1,3,4,2,7};
         Node root = null;

         for(int i=0;i<values.length;i++){
           root =  insert(root,values[i]);
         }
          
         //ArrayList<Integer> list = new ArrayList<>();
       // System.out.print( Isvalidate(root));
       
       printRange(root,5,12);
      //inorder(root);
    }
}
