class Child1 {
    static {
        System.out.println("Hello");
    }

    void add() {
        System.out.println("Addtion");
    }

    int var = 12;
}

class Child2 {
    static {
        System.out.println("HIII");
    }
    Child1 obj = new Child1();

    void dis() {
        System.out.println(obj.var);
    }
}

/**
 * CompositionInheritance
 */
public class CompositionInheritance {

    public static void main(String[] args) {

        Child2 obj2 = new Child2();
        obj2.dis();
        // System.out.println(obj2.var);
    }
}
