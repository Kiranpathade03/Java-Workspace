
public class CustomException extends Exception {
    CustomException(String str) {
        super((str));

    }
}

class Innerclass {
    static int divine(int a, int b) throws CustomException {
        if (b == 0) {
            throw new CustomException("This is my exception");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {

        try {

            int result = divine(10, 0);
            System.out.println("I am the Best");
            System.out.println("you are the best");
        } catch (CustomException e) {

            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("In finally block");
        }
    }
}