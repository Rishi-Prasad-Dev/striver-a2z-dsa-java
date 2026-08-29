package linkedlist.two_d;

import java.util.Scanner;

public class Q03_DeleteHead {

    static class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {

            this.data = data;
            this.prev = null;
            this.next = null;

        }
    }

    static Node createList(Scanner sc, int n) {

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {

            Node newNode = new Node(sc.nextInt());

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
        return head;
    }

    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static Node deleteHead(Node head) {

        if (head == null) {
            return null;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        return head;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = createList(sc, n);

        head = deleteHead(head);

        printList(head);
    }
}