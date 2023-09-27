package en.codegym.task.pro.task13.task1316;

/* 
Let's list the CodeGym quests
*/

public class Solution {

    public static void main(String[] args) {
        for(CodeGymQuest val: CodeGymQuest.values()) {
            System.out.println(val.ordinal());
        }

        for(Suit val: Suit.values()) {
            System.out.println(val + " " + val.getSymbol());
        }
    }
}
