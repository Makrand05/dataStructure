package com.biz.linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for create list");
        switch (sc.nextInt())
        {
            case 1:
                LinkedList.createLinkedList();
                LinkedList.printList();
                break;
            default:
                System.out.println("please enter correct option");
        }
    }
}
