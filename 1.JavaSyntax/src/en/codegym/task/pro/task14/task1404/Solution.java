package en.codegym.task.pro.task14.task1404;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Teaching assistant - 3
*/

public class Solution {

    public static final String PROMPT_STRING = "Enter a student number, or 'exit' to exit: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "The question will be answered by ";
    public static final String NOT_EXIST = "A student with this number does not exist";
    public static final String INTEGER_REQUIRED = "You must enter an integer";

    static List<String> studentsJournal = Arrays.asList(
            "Hugh Jass"
            , "Rita Booke"
            , "Justin Case"
            , "Robin Banks"
            , "Manny Kinn"
            , "Harry Pitts"
            , "Marty Graw"
            , "Shanda Lear"
            , "Rusty Dorr"
            , "Otto Graph");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentId = 0;
        while (true) {
            try {
                System.out.print(PROMPT_STRING);
                String input = scanner.nextLine();
                if (input.toLowerCase().equals(EXIT)) {
                    break;
                }
                studentId = Integer.parseInt(input);
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch(NumberFormatException e) {
                System.out.println(INTEGER_REQUIRED);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
