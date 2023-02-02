package com.bridgelabz.stackandqueue;

import java.util.Scanner;

public class LinkedList {

    Stack.Node top = null;

    public void push(Scanner sc) {
        System.out.println("Enter data");
        int data = sc.nextInt();
        Stack.Node newNode = new Stack.Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }
}
