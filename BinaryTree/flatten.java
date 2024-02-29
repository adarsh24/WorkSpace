

public class flatten {
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

    public static void Flatten(Node root){
        Node current = root;
        while(current != null){
            if(current.left != null){
                Node temp  = current.left;

                while(temp.right != null){
                    temp = temp.right;
                    System.out.print(current.data);
                }
                 temp.right = current.right;
                 current.right = current.left;
                 current.left = null;

                 
            }
           
           
        }
    }
         public static void main(String args[]){
            Node root = new Node(1);
             root.left = new Node(2);
             root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(5);
            Flatten(root);
    }
}
