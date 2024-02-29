import java.util.LinkedList;
import java.util.Queue;

public class Topview {
    static class Node{
        int data;
        Node left;
        Node right;

     public  Node(int data){
   this.data = data;
   this.left = null;
   this.right = null;
        }
    }

    static class Info{
        Node node;
        int hori;

      public Info(Node node,int hori){
        this.node = node;
        this.hori = hori;
       } 
    }

       public static void viewfromtop(Node root){

        // level order
        Hashmap<Integer,Node> map = new Hashmap<>();
        Queue<Info> q = new LinkedList<>();
   int min = 0,max = 0;
        q.add(new Info(root,0));
        q.add(null);

        while(!q.isEmpty()){
            Info currinfo = q.remove();
            if(currinfo == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
              if(!map.containsKey(currinfo.hori)){ // node come for first time
                  map.put(currinfo.hori,currinfo.node);
              }
              if(currinfo.node.left != null){
                q.add(new Info(currinfo.node.left,currinfo.hori-1));
              min = Math.min(min,currinfo.hori-1);
              }
              if(currinfo.node.right != null){
                q.add(new Info(currinfo.node.right,currinfo.hori+1));
                max = Math.max(max,currinfo.hori+1);
              }
            }
        }
        for(int i = min;i<=max;i++){
            System.out.print(map.get(i)+" ");
        }
        System.out.println();
       }

    public static void main(String args[]){
   Node root = new Node(1);
   root.left = new Node(2);
   root.right = new Node(3);
   root.left.right = new Node(4);
   root.left.right.right = new Node(5);
   root.left.right.right.right = new Node(6);

      viewfromtop(root);
    }
}
