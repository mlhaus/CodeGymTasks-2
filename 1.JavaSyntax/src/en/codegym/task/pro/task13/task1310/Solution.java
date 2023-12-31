package en.codegym.task.pro.task13.task1310;

import java.util.HashMap;

/* 
Student performance — 2
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Student list: ");
        printStudents();
        System.out.print("Average grade: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("William Butler Yeats", 4.3);
        grades.put("Emily Dickenson", 4.1);
        grades.put("William Shakespeare", 4.9);
        grades.put("Maya Angelou", 3.7);
        grades.put("Shel Silverstein", 3.2d);
    }

    public static void printStudents() {
        for(String studentName: grades.keySet()) {
            System.out.println(studentName);
        }
    }

    public static Double getAverageMark() {
        double sum = 0;
        for(Double gpa: grades.values()) {
            sum += gpa;
        }
        return sum / grades.size();
    }
}
