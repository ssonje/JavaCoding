public class ReverseLinkList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private static Node head;

    private static Node createLinkedList() {
        ReverseLinkList linkList = new ReverseLinkList();
        linkList.head = new Node(50);
        linkList.head.next = new Node(40);
        linkList.head.next.next = new Node(30);
        linkList.head.next.next.next = new Node(20);
        linkList.head.next.next.next.next = new Node(10);
        return linkList.head;
    }

    private static void printLinkedList(Node node) {
        Node temp = head;
        System.out.println("Element in the Linked List are as follows - ");
        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.data + ".");
            } else {
                System.out.print(temp.data + ", ");
            }

            temp = temp.next;
        }

        System.out.println("\n");
    }

    private static Node reverseLinkedList(Node head) {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public static void main(String[] args) {
        // Creating linked list manually
        head = createLinkedList();

        // Print linked list before reversing
        System.out.println("Linked List is yet to be reverse.");
        printLinkedList(head);

        // Reverse linked list
        System.out.println("Reversing linked list now.\n");
        head = reverseLinkedList(head);

        // Print linked list after reversing
        System.out.println("Linked List is reversed.");
        printLinkedList(head);
    }

}
