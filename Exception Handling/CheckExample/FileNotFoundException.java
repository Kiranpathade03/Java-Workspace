import java.io.File;
import java.io.FileReader;

public class FileNotFoundException {
    public static void main(String[] args) {
        File obj=new File("abc.txt");

        try{
            FileReader fr=new FileReader(obj);

        }catch(Exception e){
            // System.out.println("File not found");
            e.printStackTrace();
            
        }
        System.out.println("Hello");
    }
}
