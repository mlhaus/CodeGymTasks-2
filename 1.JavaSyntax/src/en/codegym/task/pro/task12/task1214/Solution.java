package en.codegym.task.pro.task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Farewell, Pascal
*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Pascal", "Pascal", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        for(int i =programmingLanguages.size() - 1; i >= 0; i--) {
            if(programmingLanguages.get(i).equals("Pascal")) {
                programmingLanguages.remove(i);
            }
        }
        programmingLanguages.forEach(System.out::println);
    }
}
