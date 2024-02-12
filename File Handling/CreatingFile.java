import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) {
        File file=new File("createfile.txt");

       try {
        if (file.createNewFile()) {
            System.out.println("new file is created...");
        }else{
            System.out.println("file is already exits");
        }
       } catch (IOException e) {
         System.out.println("Exception handle successfully");
       }

    }
}
