
abstract class Child {
    Child() {
        System.out.println("In abstract child class constuctor");
    }
    void m1(){
        System.out.println("in m1");
    }

}

/**
 * Abstactclasssconstuctor
 */
public class Abstactclasssconstuctor extends Child {
    Abstactclasssconstuctor() {
        System.out.println("In   class constcutor");
    }

    public static void main(String[] args) {
        Child obj = new Abstactclasssconstuctor();

        obj.m1();

    }
}