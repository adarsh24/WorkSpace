package StackQueue;

 import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class createStack {
    public static void main(String args[]){
    //Stack<Integer> s = new Stack<>();
    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // System.out.print(s.pop());
    // System.out.print(s.pop());
    // System.out.print(s.pop());
    // System.out.print(s.pop());
    //System.out.print(s.pop());

    // Queue<Integer> q = new LinkedList<>();
    // //queue is a interface not class.
    // q.add(1);
    // q.add(2);
    // q.add(3);
    // q.add(4);
    // q.add(5);
    // System.out.print(q.peek());
    // System.out.print(q.peek());
    // System.out.print(q.remove()+" ");
    // System.out.print(q.remove()+" ");
    // System.out.print(q.remove()+" ");
    // System.out.print(q.peek());


     Deque<Integer> d = new ArrayDeque<>();

     d.add(39);
     d.addLast(45);
     d.addLast(50);
    System.out.print( d.removeFirst());
    System.out.print( d.removeLast());
    }
}
