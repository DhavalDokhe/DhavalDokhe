package Collection;

import org.w3c.dom.Node;

public class CreatNode {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

 public class PrintMyLinkedList {
        Node n=head;
    }

    public static void main(String[] args) {
        CreatNode creatNode=new CreatNode();
        Node first =creatNode.new Node(10);
        creatNode.head=first;
    }
}
