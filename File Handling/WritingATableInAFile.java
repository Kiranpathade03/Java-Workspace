import java.io.FileWriter;
import java.io.IOException;

public class WritingATableInAFile {
    public static void main(String[] args) {
        try {
            FileWriter fr = new FileWriter(
                    "C:\\Users\\kiramn patahade\\Desktop\\JAVA class\\Java-Workspace\\File Handling\\createfile.txt" );
            try {
               for(int i=1; i<=10; i++){
                int ans=i*2597;
                String number=Integer.toString(ans);
                fr.write(number +"\n");
               }
            } finally {
                 fr.close();
            }
        } catch (IOException e) {

        }
    }
}
