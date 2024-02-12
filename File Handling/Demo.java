import java.io.*;

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {

        File file = new File("file2.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File already exits");
            }
        } catch (Exception e) {
             e.printStackTrace();
        }

    }
}