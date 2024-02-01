package UncheckException;

public class UncheckedException {
    public static void main(String[] args) {
        String str=null;
        try {
            int length=str.length();
        } catch (Exception e) {
            e.setStackTrace(null);
        }
    }
}
