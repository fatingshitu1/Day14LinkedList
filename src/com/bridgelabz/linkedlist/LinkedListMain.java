package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);

        linkedList1.display();

        // deleting the last Element of linked-list

        System.out.println(linkedList1.popLast());
        linkedList1.display();
        System.out.println();

        LinkedList<Integer>LinkedList2 = new LinkedList();
        LinkedList2.append(56);
        LinkedList2.append(30);
        LinkedList2.append(70);

        LinkedList2.display();
        // deleting First Element of linked list

        System.out.println(LinkedList2.pop());
        LinkedList2.display();
        System.out.println();

        LinkedList<Integer>LinkedList3 = new LinkedList();
        LinkedList2.push(70);
        LinkedList2.push(30);
        LinkedList2.push(56);

        LinkedList3.display();
        if (LinkedList3.search (40)== null)
            System.out.println("Element not found !!");
        else
            System.out.println("Element Found !!");

        boolean isInserted = LinkedList3.insertAfter(40,30);
        if (isInserted)
            System.out.println("Element inserted successfully !!");
        else
            System.out.println("Element not inserted!!");
        LinkedList3.display();
    }
}


