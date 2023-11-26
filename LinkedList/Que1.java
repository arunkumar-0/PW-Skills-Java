package LinkedList;

//Q1. Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
public class Que1 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    // insertion
    public void insert(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = new Node(newData);
            return;
        }
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    public void isPresent(int x) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == x) {
                System.out.println(x + " is present in the linked list ");
                break;
            }
        }
    }

    // displaying
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "->");
            temp = temp.next;

        }
    }

    public static void main(String[] args) {
        Que1 q = new Que1();
        q.insert(12);
        q.insert(23);
        q.insert(1);
        q.insert(90);
        q.isPresent(12);
    }
}
