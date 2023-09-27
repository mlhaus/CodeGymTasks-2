package en.codegym.task.pro.task13.task1306;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Studying the methods of the Collections class. Part 1
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> alphabet = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ArrayList<String> alphabet2 = new ArrayList<>(Arrays.asList("Z", "Y", "X", "W", "V"));
        copy(alphabet2, alphabet);
        alphabet2.forEach(System.out::println);
        addAll(alphabet2, "E", "A", "G", "H");
        alphabet2.forEach(System.out::println);
        replaceAll(alphabet2, "A", "M");
        alphabet2.forEach(System.out::println);
    }

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);
    }
}
