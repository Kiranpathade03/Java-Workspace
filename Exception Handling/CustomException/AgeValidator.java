/**
 * AgeNotValidException
 */
  class AgeNotValidException extends Exception {

    public AgeNotValidException(String str) {
        super(str);
    }
}
/**
 * AgeValidator
 */

public class AgeValidator {

    static int check(int age) throws AgeNotValidException{
        if (age<18) {
            throw new AgeNotValidException("age is not valid for vote");
        }else{
            return age;
        }
    }

    public static void main(String[] args) {
        try{
            check(22);

        }catch(AgeNotValidException e){
            e.printStackTrace();
        }
    }
}