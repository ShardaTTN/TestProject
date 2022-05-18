//1.  Reverse the items of a linked list:
//
//Input - 4 -> 6 -> 7 -> 1 -> 5 - > 8 -> 3 -> 2 -> NULL
//Output- 2 -> 3 -> 8 -> 5 -> 1 -> 7 -> 6 -> 4 -> NULL

import java.util.Scanner;

public class LinkedList {
    static Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void printLinkedList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.println("NULL");
    }

    void insert(int data) {
        Node tempNode = new Node(data);
        tempNode.next = head;
        head = tempNode;
    }

    Node reverseLinkedList(Node node) {
        Node prev = null;
        Node curr = node;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {

        //Question 1
        LinkedList linkedList = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many nodes do you want: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value to insert in node: ");
            int num = sc.nextInt();
            linkedList.insert(num);
        }

        System.out.println("\nOriginal Linked List: ");
        linkedList.printLinkedList();

        head = linkedList.reverseLinkedList(head);
        System.out.println("\nReversed Linked List: ");
        linkedList.printLinkedList();

        //Question 2
        String s1 = "javatpoint";
        String s2 = "javatpoint";

        if (s1 == s1) {
            System.out.println("true");
        }

        sc.close();
    }

}
