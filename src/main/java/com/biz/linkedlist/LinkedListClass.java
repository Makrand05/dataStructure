package com.biz.linkedlist;

public class LinkedListClass {
    Node head;
    Node tail;

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            this.head = node;
            this.tail = node;
        } else {
            Node temp = this.head;
            this.head = node;
            node.next = temp;
        }
    }

    void printList() {
        Node node = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (node != null) {
                if (node.next != null) {
                    System.out.print(node.data + " -> ");
                } else
                    System.out.println(node.data);
                node = node.next;
            }
        }
    }

    public void appendData(int data) {
        Node node = new Node(data);
        if (head == null) {
            this.head = node;
        } else {
            tail.next = node;
        }
        this.tail = node;
    }

    public void addMid(int data) {
        Node node = new Node(data);
        int size = calculateLength();
        Node temp, current = null;
        if (head == null) {
            this.head = node;
            this.tail = node;
        } else {
            temp = head;
            int count = (size % 2 == 0) ? (size / 2) : (size + 1) / 2;
            for (int i = 0; i < count; i++) {
                current = temp;
                temp = temp.next;
            }
            current.next = node;
            node.next = temp;
        }


    }

    public int calculateLength() {
        int index = 0;
        Node temp = head;
        while (temp != null) {
            index++;
            temp = tail.next;
        }
        return index;
    }

    public void pop() {
        head = head.next;

    }
}
