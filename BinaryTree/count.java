public class count {
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

    public static int Height(Node root){
        if(root == null){
            return 0;
        }
        int lh = Height(root.left);
        int rh = Height(root.right);
        int max = Math.max(lh,rh);
        return max+1;
    }

public static int Count(Node root){
    if(root == null){
        return 0;
    }
    int lc = Count(root.left);
    int rc = Count(root.right);
    
    
    int max = lc + rc;
    return max+1;
}

    public static void main(String args[]){
     Node root = new Node(1);
     root.left = new Node(2);
     root.right = new Node(3);
     root.left.left = new Node(4);
     root.left.right = new Node(5);
     root.right.left = new Node(6);
  root.right.right = new Node(7);
   root.left.left.left = new Node(8);
    root.left.left.left.left = new Node(4);

  System.out.print(Count(root));
    }
}
