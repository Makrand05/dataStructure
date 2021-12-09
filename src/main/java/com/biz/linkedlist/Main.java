package com.biz.linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for create list");
        System.out.println("Enter 2 for add at beginning");
        System.out.println("Enter 3 for append the element");
        System.out.println("Enter 4 for add in Middle ");
        System.out.println("Enter 5 for the delete first element");
        System.out.println("Enter 6 for Delete last element");
        System.out.println("Enter 7 for Search the element ...");
        switch (sc.nextInt())
        {
            case 1:
                LinkedList.createLinkedList();
                LinkedList.printList();
                break;
            case 2:
                LinkedList.addBefore();
                break;
            case 3:
                LinkedList.append();
                break;
            case 4:
                LinkedList.addInMid();
                break;
            case 5:
                LinkedList.deleteFirst();
                break;
            case 6:
                LinkedList.deleteLast();
                break;
            case 7:
                LinkedList.search();
                break;
            default:
                System.out.println("please enter correct option");
        }
    }
}
