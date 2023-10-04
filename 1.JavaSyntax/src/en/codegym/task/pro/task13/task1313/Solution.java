package en.codegym.task.pro.task13.task1313;

/* 
StringLinkedList
*/

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("tree");
        linkedList.add("pumpkin");
        linkedList.add("banana");
        linkedList.forEach(System.out::println);
        System.out.println();
        StringLinkedList stringLinkedList = new StringLinkedList();
        stringLinkedList.add("tree");
        stringLinkedList.add("pumpkin");
        stringLinkedList.add("banana");
        stringLinkedList.printAll();
    }
}
