class Parent{
    void marry(){
        System.out.println("Saniya");
       
    }
}
class Child extends Parent{
    void marry(){
        System.out.println("disha");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Parent obj=new Child();
        obj.marry();
    }
}
