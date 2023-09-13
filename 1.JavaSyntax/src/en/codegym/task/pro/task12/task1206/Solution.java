package en.codegym.task.pro.task12.task1206;

/* 
Analyzing strings
*/

public class Solution {

    public static void main(String[] args) {
        String string = "I think this will be a new feature. " +
                "Just don't tell anyone that it was an accident.";

        System.out.println("Number of digits in the string: " + countDigits(string));
        System.out.println("Number of letters in the string: " + countLetters(string));
        System.out.println("Number of spaces in the string: " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //write your code here
        int count = 0;
        for(int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        //write your code here
        return 0;
    }

    public static int countSpaces(String string) {
        //write your code here
        return 0;
    }
}
