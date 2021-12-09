package com.biz.linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for create list");
        System.out.println("Enter 2 for add at beginning");
        System.out.println("Enter 3 for append the element");
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
            default:
                System.out.println("please enter correct option");
        }
    }
}
