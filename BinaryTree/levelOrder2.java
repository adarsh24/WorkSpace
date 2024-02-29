import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.jar.Attributes.Name;

public class levelOrder2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static void Level2Order(Node root){

           
            Queue<Node> q = new LinkedList<>();
      if(root == null) return;
            q.add(root);

            while(!q.isEmpty()){
               
                int len = q.size();
                ArrayList<Integer> list = new ArrayList<>(len);
                Node currnode = q.remove();
                for(int i=0;i<len;i++){
                    if(currnode.left !=null){
                        q.add(currnode.left);
                    }
                    if(currnode.right !=null){
                        q.add(currnode.right);
                    }

                    list.add(currnode.data);
                }

               for(int i=0;i<list.size();i++){
                System.out.print(list.get(i));
               } 
               System.out.println();
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

            Level2Order(root);
        }
    }
}
