package UncheckException;

public class ArrayOutOfBound {
    public static void main(String[] args) {
        try {
            int[] arr={2,3,4,5};
            System.out.println(arr[6]);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
