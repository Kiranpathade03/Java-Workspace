/**
 * RuntimePolymorphisum
 */
public class CompiletimePolymorphism {

    public static void main(String[] args) {
        Childpoly obj=new Childpoly();

        obj.m1();
        obj.m1(2,3);
        obj.m1(23);
    }
}