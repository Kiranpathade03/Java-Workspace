import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File file=new File("createfile.txt");

        if (file.exists()) {
            System.out.println("File Name :"+ file.getName());
            System.out.println("File Path :"+ file.getAbsolutePath());
            System.out.println("File writable :"+ file.canWrite());
            System.out.println("File readable :"+ file.canRead());
            System.out.println("File size :"+ file.length());
            System.out.println("delete a file :"+file.delete());

        }else{
            System.out.println("File does not exits");
        }
    }
}
