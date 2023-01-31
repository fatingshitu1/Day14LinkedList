package com.bridgelabz.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);



        linkedList1.display();
        System.out.println();


        LinkedList<Integer>LinkedList2 = new LinkedList();
        LinkedList2.append(56);
        LinkedList2.append(30);
        LinkedList2.append(70);
    }
}

