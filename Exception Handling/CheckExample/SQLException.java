import java.sql.Connection;
import java.sql.DriverManager;

public class SQLException {
    public static void main(String[] args) {
        

        try {
            Connection ref = DriverManager.getConnection("jdbc:mysql://database", "username", "password");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
