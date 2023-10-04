package en.codegym.task.pro.task14.task1410;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FileUtils {
    private static final String FILE_PATH = "1.JavaSyntax/src/main/resources/";
    private static final Map<String, Integer> words = new HashMap<>();

    public static void readFile(String fileName) throws IOException {
//        System.out.println("Reading the file contents: " + fileName);
//        List<String> lines = Files.readAllLines(Paths.get(FILE_PATH + fileName));
//        lines.forEach(line -> {
//            String[] strArr = line.split(" ");
//            for(String str: strArr) {
//                str = str.trim();
//                if(str.isBlank()) {
//                    continue;
//                }
//                String cleanWord = str.toLowerCase().replaceAll("[^\\w-]", ""); // removes any non-word character except a dash
//                words.add(cleanWord);
//            }
//        });
        System.out.println("Reading the file contents: " + fileName);
        List<String> lines = Files.readAllLines(Paths.get(FILE_PATH + fileName));
        lines.forEach(line -> {
            String[] strArr = line.split(" ");
            for(String string: strArr){
                string = string.trim();
                if (string.isBlank()){
                    continue;
                }
                String cleanWord = string.toLowerCase().replaceAll("[^\\w-]", "");
                if (words.containsKey(cleanWord)){ // If the word contains the string
                    words.put(cleanWord, words.get(cleanWord) + 1); //Put it back, incrementing the variable by one
                }
                else{ //
                    words.put(cleanWord, 1);
                }
            }
        });
    }

    public static void writeFile(String fileName) throws IOException {
        System.out.println("Writing data to the file: " + fileName);
        try(PrintWriter writer = new PrintWriter(new File(FILE_PATH + fileName))) {
            words.forEach((word, count) -> writer.println(word + ":" + count));
        }
    }

    public static void copyFile(String sourceFile, String destinationFile) {
        try {
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);
        } catch (IOException e) {
            System.out.println("File input error");
        }
    }
}
