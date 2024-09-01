class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to add a new node at the end of the list
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to reverse the linked list
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next; // Store next node
            current.next = previous; // Reverse current node's pointer
            previous = current; // Move pointers one position ahead
            current = next;
        }
        head = previous;
    }

    // Method to find the element at a specific index
    public int findElementAt(int index) {
        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }

        throw new IndexOutOfBoundsException("Index " + index + " out of bounds.");
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Append elements to the linked list
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        // Print the original list
        System.out.println("Original Linked List:");
        list.printList();

        // Reverse the linked list
        list.reverse();
        System.out.println("Reversed Linked List:");
        list.printList();

        // Find element at a specific index
        int index = 2;
        try {
            int element = list.findElementAt(index);
            System.out.println("Element at index " + index + " is: " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
