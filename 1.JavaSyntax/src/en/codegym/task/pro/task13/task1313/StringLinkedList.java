package en.codegym.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node(); // red
    private Node last = new Node();  // blue

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null && currentElement.value != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;
        Node tempNode = last.prev;
        newNode.next = last;
        last.prev = newNode;
        newNode.prev = tempNode;
        tempNode.next = newNode;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
