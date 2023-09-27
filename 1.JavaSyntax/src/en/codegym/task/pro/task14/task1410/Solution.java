package en.codegym.task.pro.task14.task1410;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/* 
Wrapping exceptions
*/

public class Solution {

    public static void main(String[] args) {
        FileUtils.copyFile("book.txt", "book_final_copy.txt");
    }

    
}
