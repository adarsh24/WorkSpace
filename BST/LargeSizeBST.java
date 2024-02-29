package BST;

public class LargeSizeBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST,int size,int min,int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public  static int maxBST = 0;
    public static Info largeBST(Node root){
        if(root == null) return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);

        Info infoleft = largeBST(root.left);
        Info inforight = largeBST(root.right);

        int size = infoleft.size + inforight.size + 1;

        int  min = Math.min(root.data,Math.min(infoleft.min,inforight.min));
        int  max = Math.max(root.data,Math.max(infoleft.max,inforight.max));

        if(root.data <= infoleft.max || inforight.min <= root.data){
            return new Info(false,size,min,max);
        }
        if(infoleft.isBST && inforight.isBST){
            maxBST = Math.max(maxBST,size);
            return new Info(true,size,min,max);
        }

        return new Info(false,size,min,max);
    }
    public static void main(String args[]){
         
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

       Info info = largeBST(root);
       System.out.println("largest BST"+" "+  maxBST);

    }
}
