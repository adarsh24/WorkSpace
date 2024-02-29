import java.util.LinkedList;
import java.util.Queue;

public class maxNodeInLevel {
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

 public static void  MaxNode(Node root){
            if(root == null){
                return;
            }
       Queue<Node> q = new LinkedList<>();

       q.add(root);
       q.add(null);
 

       while(!q.isEmpty()){
  Node currNode = q.remove();
      if(currNode == null){
        System.out.println();

         if(q.isEmpty()){
        break;
      }
      else{
        q.add(null);
      }
      }
     
      else{
       System.out.print(currNode.data+" "); 
       if(currNode.left != null){
          q.add(currNode.left);
       }
       if(currNode.right != null){
        q.add(currNode.right);
       }
      }
       }
         }
        

    public static void main(String args[]){

        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        root.left.left  = new Node(4);
        root.left.right  = new Node(6);
        root.left.right.left  = new Node(5);
        root.right.right = new Node(8);

        MaxNode(root);
    }
}
