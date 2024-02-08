/**
 * OOPCustomException
 */
public class OOPCustomException extends Exception {

    OOPCustomException(String str) {
        super(str);
    }
}

class InnerOOPCustomException_1 {
    static int add(int a, int b) throws OOPCustomException {
        if (b == 0) {
            throw new OOPCustomException("Exception occured");
        } else {
            return a / b;
        }

    }

    static int add(float a, int b) throws OOPCustomException {
        if (b == 0) {
            throw new OOPCustomException("Exception occured float");
        } else {
            return a / b;
        }
    }

}

class InnerOOPCustomException extends InnerOOPCustomException_1 {
    public static void main(String[] args) {

        try {
            int result = InnerOOPCustomException_1.add(23.4f,0);

        } catch (OOPCustomException e) {
            e.printStackTrace();
        }
    }

}