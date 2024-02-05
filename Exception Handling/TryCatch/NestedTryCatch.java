import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NestedTryCatch {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int a = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            int a = 0;
            try {
                a = 4 / 0;
            } catch (Exception ex) {
                System.out.println(a);
            }
        }
    }
}
