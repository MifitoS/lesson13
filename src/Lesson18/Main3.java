package Lesson18;

import java.io.File;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\MSI PC\\Desktop\\ADINADINADIN");
        if (!dir.exists()){
            try {
                dir.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
