package en.codegym.task.pro.task14.task1406;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Buy an elephant
*/

class Solution {

    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("Buy an elephant");
        } else if (answer.toLowerCase().equals("ok")) {
            System.out.println("That's better :) List of your excuses: ");
            throw new SecurityException();
        } else {
            System.out.println("Everyone says \"" + answer + "\", but you say to buy an elephant");
            list.add(answer);
        }

        answer = scanner.nextLine();

        try {
            buyElephant(answer, scanner);
        } catch (Exception e) {
            //write your code here
            System.out.println(answer);
            for(int i = list.size() - 1; i >= 0; i--) {
                System.out.println(list.get(i));
            }
            throw e;
        }
    }
}
