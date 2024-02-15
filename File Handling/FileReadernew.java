import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadernew {
    public static void main(String[] args) {
        //read one one charcater
        try {
            FileReader fr = new FileReader(
                    "C:\\Users\\kiramn patahade\\Desktop\\JAVA class\\Java-Workspace\\File Handling\\createfile.txt");
            while (fr.ready()) {
                System.out.println((char) fr.read());
            }
        } catch (Exception e) {
             e.printStackTrace();
        }

        // read String

        try {
            
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\kiramn patahade\\Desktop\\JAVA class\\Java-Workspace\\File Handling\\createfile.txt"));

            System.out.println(br.readLine()+" kiranpathade");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
