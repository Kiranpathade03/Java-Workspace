/**
 * StackOverFlowError
 */
public class StackOverFlowError {

    void increment(int i){
        System.out.println(i);
       increment(i);
    }
    public static void main(String[] args) {
        StackOverFlowError obj=new StackOverFlowError();

        obj.increment(1);
    }
}