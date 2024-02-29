public class inOrder {
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
         public static void  InOrder(node root){
         if(root == null){
             return;
         }
        
         InOrder(root.left);
          System.out.print(root.data+" ");
         InOrder(root.right); 
         }
        }
         
         public static void main(String args[]){
             int Node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     
             BinaryTree tree = new BinaryTree();
             node root = tree.Buildtree(Node);
              tree. InOrder(root);
             //System.out.print(root.data);
         }
}
