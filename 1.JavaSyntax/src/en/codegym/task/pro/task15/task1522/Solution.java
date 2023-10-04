package en.codegym.task.pro.task15.task1522;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* 
Getting information through an API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://api.github.com/users/mlhaus");
        InputStream stream = url.openStream();
        byte[] bytes = stream.readAllBytes();
        String json = new String(bytes);
        System.out.println(json);
    }
}