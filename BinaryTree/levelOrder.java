import java.util.LinkedList;
import java.util.Queue;

public class levelOrder {
    static class node{
        int data;
        node left;
        node right;
     
          node(int data){
         this.data = data;
         this.left = null;
         this.right = null;
        }
     }
     
       public  static class BinaryTree{
         static int idx  = -1;
        public static node Buildtree(int Node[]){
         idx++;
           if(Node[idx] == -1){
             return null;
     
           }
           node newNode = new node(Node[idx]);
           newNode.left = Buildtree(Node);
           newNode.right = Buildtree(Node);
           return newNode;
         }
         public static void  LevelOrder(node root){
            if(root == null){
                return;
            }
       Queue<node> q = new LinkedList<>();

       q.add(root);
       q.add(null);
 

       while(!q.isEmpty()){
  node currNode = q.remove();
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
        }
         
         public static void main(String args[]){
             int Node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     
             BinaryTree tree = new BinaryTree();
             node root = tree.Buildtree(Node);
              tree. LevelOrder(root);
             //System.out.print(root.data);
         }
}
