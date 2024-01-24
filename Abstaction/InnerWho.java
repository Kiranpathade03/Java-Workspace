abstract class Who {

Who(){
    System.out.println("Constuctor");
}

    void sub(int a, int b) {
        System.out.println(a - b);
    }

    abstract void add(int a, int b);
}

class India extends Who {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void Div(int a, int b) {
        System.out.println(a / b);
    }
}

/**
 * InnerWho
 */
public class InnerWho {

    public static void main(String[] args) {
        Who obj = new India();
       
        obj.add(2, 4);
        obj.sub(5, 7);
    }
}