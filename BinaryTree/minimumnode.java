public class minimumnode {
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
    public static int minimum(Node root){
        if(root == null){
            return Integer. MAX_VALUE;
        }

        int leftmax = minimum(root.left);
        int rightmax =  minimum(root.right);

        return Math.min(root.data,Math.min(leftmax,rightmax));
        
    }

    public static void main(String args[]){
        Node root = new Node(9);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
         System.out.print(  minimum(root));
    }
}
