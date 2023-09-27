package en.codegym.task.pro.task13.task1314;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        Node node = first.next;
        int count = 0;
        if(index == count) {
            return node.value;
        }
        while(node.next != null) {
            count++;
            node = node.next;
            if(index == count) {
                return node.value;
            }
        }
        return null;

//        int currentIndex = 0;
//        Node currentElement = first.next;
//        while ((currentElement) != null) {
//            if (currentIndex == index) {
//                return currentElement.value;
//            }
//            currentElement = currentElement.next;
//            currentIndex++;
//        }
//        return null;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
