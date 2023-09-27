package en.codegym.task.pro.task14.task1410;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileUtils {
    private static final String FILE_PATH = "1.JavaSyntax/src/main/resources/";
    private static final Set<String> words = new HashSet<>();

    public static void readFile(String fileName) throws IOException {
        System.out.println("Reading the file contents: " + fileName);
        List<String> lines = Files.readAllLines(Paths.get(FILE_PATH + fileName));
        lines.forEach(line -> {
            String[] strArr = line.split(" ");
            for(String str: strArr) {
                str = str.trim();
                if(str.isBlank()) {
                    continue;
                }
                String cleanWord = str.toLowerCase().replaceAll("[^\\w-]", ""); // removes any non-word character except a dash
                words.add(cleanWord);
            }
        });
    }

    public static void writeFile(String fileName) throws IOException {
        System.out.println("Writing data to the file: " + fileName);
        try(PrintWriter writer = new PrintWriter(new File(FILE_PATH + fileName))) {
            words.forEach(word -> writer.println(word));
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
