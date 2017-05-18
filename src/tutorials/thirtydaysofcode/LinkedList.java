package tutorials.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by manishgiri on 5/17/17.
 */
public class LinkedList {

    private class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    private void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    private Node insert(Node head, int data) {
        //Complete this method
        Node newNode;
        if(head == null) {
            newNode = new Node(data);
            newNode.next = null;
            return newNode;

        }
        else {
            newNode = new Node(data);
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = null;
            return head;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        LinkedList linkedList = new LinkedList();

        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = linkedList.insert(head,ele);
        }
        linkedList.display(head);
        sc.close();
    }


}
