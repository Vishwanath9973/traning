package day8;

public class mergelinkedlist {
	static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node merge(Node a, Node b) {
        Node result = new Node(0);
        Node current = result;

        while (a != null && b != null) {
            if (a.data < b.data) {
                current.next = a;
                a = a.next;
            } else {
                current.next = b;
                b = b.next;
            }
            current = current.next;
        }

        if (a != null)
            current.next = a;
        else
            current.next = b;

        return result.next;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        a.next = new Node(3);
        a.next.next = new Node(5);

        Node b = new Node(2);
        b.next = new Node(4);
        b.next.next = new Node(6);

        Node merged = merge(a, b);

        System.out.println("Merged Linked List:");
        display(merged);
    }
}
	