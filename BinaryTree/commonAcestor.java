import java.util.ArrayList;

public class commonAcestor {
   public static  class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int CommonAncestor(Node root,int n1,int n2){
        ArrayList<Integer> list = new ArrayList<>();
            if(root.data == n1){}

    }
    public static void main(String args[]){
        Node root  = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        CommonAncestor(root,4,7);
        
        
    }
}
