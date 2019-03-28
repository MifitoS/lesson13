package Lesson18;

import java.io.File;
import java.io.FileFilter;

public class Main10 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\MSI PC\\Desktop\\bass");
        File [] dirs = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.getAbsolutePath().endsWith(".mp3")|| pathname.getAbsolutePath().endsWith(".jpg")||pathname.getAbsolutePath().endsWith(".png")
                        ||pathname.getAbsolutePath().endsWith(".jpeg")||pathname.isDirectory()){
                    return true;
                }
                return false;
            }
        });
        for (File f:dirs){
            System.out.println(f.getAbsolutePath());
        }
    }



}
