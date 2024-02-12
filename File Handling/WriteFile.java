import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter=new FileWriter("createfile.txt");
            try{
                fileWriter.write("Hello i am Kiran pathade");
            }finally{
                fileWriter.close();
            }
            System.out.println("Sucessfully write a data");
        } catch (IOException e) {
             System.out.println("Exception handled");
        }
    }
}
