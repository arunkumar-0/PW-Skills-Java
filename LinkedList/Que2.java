package LinkedList;

public class Que2 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    // insertion at end point
    public void insertion(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    // insertion at any point
    public void insertPoint(Node pointer, int value) {
        Node newNode = new Node(value);
        Node temp = head;
        while (temp.data != pointer.data) {
            temp = temp.next;
        }
        newNode.next = pointer.next;
        pointer.next = newNode.next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Que2 q = new Que2();
        q.insertion(12);
        q.insertion(42);
        q.insertion(90);
        q.insertPoint(null, 30);
        q.display();

    }
}
