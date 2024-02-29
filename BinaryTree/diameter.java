public class diameter {
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

   

static class info{
    int diam;
    int ht;

     public info(int diam,int ht){
        this.diam = diam;
        this.ht = ht;
    }
}

public static info diameter(Node root){
    //base  case
     if(root == null ){
        return  new info(0,0) ;
     }

     info leftdiam = diameter(root.left);
     info rightdiam = diameter(root.right);
    int ht = Math.max(leftdiam.ht,rightdiam.ht)+1;
    int diam = Math.max(Math.max(leftdiam.diam,rightdiam.diam),leftdiam.ht+rightdiam.ht+1);
    return new info(diam,ht);
   
}
   

    public static void main(String args[]){
     Node root = new Node(1);
     root.left = new Node(2);
     root.right = new Node(3);
     root.left.left = new Node(4);
     root.left.right = new Node(5);
     root.right.left = new Node(6);
  root.right.right = new Node(7);
   
 System.out.print(diameter(root).diam);
  
    }
}
