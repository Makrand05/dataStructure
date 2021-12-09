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
}
