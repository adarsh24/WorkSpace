public class halfNode {
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
    public static int HalfNode(Node root){
        if(root == null){
            return Integer. MAX_VALUE;
        }

        int leftmax = HalfNode(root.left);
        int rightmax =  HalfNode(root.right);

        return Math.min(root.data,Math.min(leftmax,rightmax));
        
    }

    public static void main(String args[]){
        Node root = new Node(7);
        root.left = new Node(7);
        root.right = new Node(8);
        root.left.left = new Node(2);
        
         System.out.print(  HalfNode(root));
    }
}
