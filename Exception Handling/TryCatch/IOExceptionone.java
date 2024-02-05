package TryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExceptionone {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int a = Integer.parseInt(br.readLine());
        } 
        catch (Exception ex) {
            System.out.println("in IO exception");
            ex.printStackTrace();
        }
        
    }
}
