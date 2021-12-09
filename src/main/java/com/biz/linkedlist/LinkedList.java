package com.biz.linkedlist;

public class LinkedList {
    static Node head;//=firstNode;
    static Node tail;//=thirdNode;

    public static void createLinkedList() {
        Node firstNode =new Node(56);
        Node secondNode=new Node(30);
        Node thirdNode=new Node(70);

        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        head=firstNode;
        tail=thirdNode;

    }

    public static void printList() {
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static LinkedListClass addBefore() {
        LinkedListClass linkedListClass=new LinkedListClass();
        linkedListClass.add(70);
        linkedListClass.add(30);
        linkedListClass.add(56);
        linkedListClass.printList();

        return linkedListClass;
        
    }

    public static void append() {
        LinkedListClass linkedListClass =new LinkedListClass();
        linkedListClass.appendData(56);
        linkedListClass.appendData(30);
        linkedListClass.appendData(70);
        linkedListClass.printList();
    }

    public static void addInMid() {
        LinkedListClass linkedListClass =new LinkedListClass();
        linkedListClass.appendData(56);
        linkedListClass.appendData(70);
        linkedListClass.addMid(30);
        linkedListClass.printList();
    }

    public static void deleteFirst() {
        LinkedListClass linkedListClass=addBefore();
        linkedListClass.printList();
        linkedListClass.pop();
        linkedListClass.printList();

    }


}
