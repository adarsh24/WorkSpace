public class KthLevel {

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

    public static void findnodeAtlevel(Node root,int k,int level){
       if(root == null) return;

       if(k == level){
        System.out.print(root.data+" ");
        return;
       }

       findnodeAtlevel(root.left,k,level+1);
       findnodeAtlevel(root.right,k,level+1);

    }
    public static void main (String args[]){
  Node root = new Node(1);
  root.left = new Node(2);
  root.right = new Node(3);
  root.left.left = new Node(4);
  root.left.right = new Node(5);
  root.right.left = new Node(6);
  root.right.right = new Node(7);

  int k = 3;
  int level = 2 ;

  findnodeAtlevel(root,k,level);


    }
}
