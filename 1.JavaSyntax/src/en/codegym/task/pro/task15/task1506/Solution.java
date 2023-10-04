package en.codegym.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Face control
*/

public class Solution {
    private static final String FILE_PATH = "1.JavaSyntax/src/main/resources/";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String fileName = scanner.nextLine();
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_PATH + fileName));
            System.out.println(lines.size());
        } catch (IOException e) {
            System.out.println("Cannot read file");
        }
    }
}

