public class DobuleException extends Exception {
    DobuleException(String str) {
        super(str);
    }
}
class ExtraException extends Exception{
    ExtraException(String str){
        super(str);
    }
}
/**
 * InnerDobuleException
 */
class InnerDobuleException {

    static void greter(int a, int b) throws DobuleException {
        if (a > b) {
            throw new DobuleException("A  is greter");
        } 
        

    }

    static void bgreter(int a , int b) throws ExtraException{
        if (b>a ) {
            throw new ExtraException("B is greter");
        }
    }

    public static void main(String[] args) {
        try {
            greter(2, 6);
        } catch ( DobuleException e) {
             e.printStackTrace();
        } 
    }
}
