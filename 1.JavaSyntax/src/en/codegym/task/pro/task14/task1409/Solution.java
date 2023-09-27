package en.codegym.task.pro.task14.task1409;

/* 
Passing through ourselves
*/

public class Solution {

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            try {
                generateLuckyNumber();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("Unlucky!");
        }
        System.out.println("Your lucky number: " + luckyNumber);
    }
}
