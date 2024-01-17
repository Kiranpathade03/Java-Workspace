/**
 * RuntimePolymorphisum
 */
public class RuntimePolymorphisum {

    public static void main(String[] args) {
        Child obj=new Child();

        obj.m1();
        obj.m1(2,3);
        obj.m1(23);
    }
}