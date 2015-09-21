package com.example.waht;

/**
 * Created by Administrator on 2015/5/29.
 */
public class DoubleLinkedList1 {
    public void add(String string) {
        addLast(new Node(string));
    }

    // Ω⁄µ„¿‡Node
    private  class Node{
        private Object value=this;
       private   Node prev=this;
      private    Node next=this;
        Node(Object o){
            value=o;
        }
        public String toString(){
            return value.toString();
        }
    }
    public String toString()
    {
        StringBuffer s = new StringBuffer("[");
        Node node = head;
        for (int i = 0; i < size; i++)
        {
            node = node.next;
            if (i > 0)
                s.append(", ");
            s.append(node.value);
        }
        s.append("]");
        return s.toString();
    }
    private Node head=new Node(null);
    private int size;
    public void addFirst(Object o){
        addAfter(new Node(o), head);
    }
    public void addLast(Object o){
        addBefor(new Node(o),head);
    }

    public void addAt(Object o,int index){

        addBefor(new Node(o),getNode(index));
    }
    public Node getNode(int index){
        Node node=head;
        for(int i=0;i<index;i++)
                node=node.next;
        return node;

    }
    public void addAfter(Node newNode,Node node){
        newNode.prev=node;
        newNode.next=node.next;
        node.next.prev=newNode;
        node.next=newNode;
        size++;
    }

    public void addBefor(Node newnode, Node node){
        newnode.prev=node.prev;
        newnode.next=node;
        node.prev.next=newnode;
        node.prev=newnode;
        size++;
    }
}
