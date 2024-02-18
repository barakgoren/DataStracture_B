package Les04;

import Les02.LinkedList;
import Les02.Node;

public class NodeTask {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        head.setNext(new Node<>(2));
        head.getNext().setNext(new Node<>(4));
        head.getNext().getNext().setNext(new Node<>(5));
        head.getNext().getNext().getNext().setNext(new Node<>(6));
        head.getNext().getNext().getNext().getNext().setNext(new Node<>(7));

//        Node<Integer> newHead = split(head);
        addNode(head, new Node<>(8));
        System.out.println(head.toString());
    }

    public static void addNode(Node<Integer> head, Node<Integer> toAdd) {
        if(head.getNext() == null) {
            head.setNext(toAdd);
        } else {
            addNode(head.getNext(), toAdd);
        }
    }
    public static Node<Integer> split(Node<Integer> head) {
        if(head == null) {
            return null;
        }
        Node<Integer> newHead = null;
        Node<Integer> temp = head;
        if(head.getValue()%2 == 0){
            while(temp.hasNext()){
                if(temp.getValue()%2 != 0){
                    addNode(newHead, temp);
                }
                temp = temp.getNext();
            }
        } else {
            while(temp.hasNext()){
                if(temp.getValue()%2 == 0){
                    addNode(newHead, temp);
                }
                temp = temp.getNext();
            }
        }
        return newHead;
    }
}
