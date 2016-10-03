/**
 * Created by Nick on 10/3/16.
 */
public class Stack {
    private Node last = null;

    public Stack(){

    }

    //initialize the stack with a node
    public Stack(int n){
        last = new Node(n);
    }


    public int pop(){
        int val = last.getValue();
        last = last.getNext();
        return val;
    }

    public void push(int n){
        Node node = new Node(n);
        node.setNext(last);
        last = node;
    }

    public int count(){
        int c = 1;
        Node curr = last;
        if(curr == null){
            return 0;
        }
        if(curr.hasNext() == false){
            return 1;
        }

        while(curr.hasNext()){
            curr = curr.getNext();
            c++;
        }
        return c;
    }

    //Node class
    private class Node {
        private int data;
        private Node next = null;

        public Node(int d){
            data = d;
        }

        public int getValue(){
            return data;
        }

        public void setValue(int n){
            data = n;
        }

        public Node getNext(){
            return next;
        }

        public void setNext(Node n){
            next = n;
        }

        public boolean hasNext(){
            if(next != null){
                return true;
            }else{
                return false;
            }
        }
    }
}
