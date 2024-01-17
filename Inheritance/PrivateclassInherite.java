class Parent {
    static {
        System.out.println("Parent constractar");
    }

    private void m1() {
        System.out.println("in m1()");
    }
    Parent obj1=new Parent();
    obj1.m1();

}

public class PrivateclassInherite extends Parent {

    public static void main(String[] args) {
        PrivateclassInherite obj = new PrivateclassInherite();

    }
}
