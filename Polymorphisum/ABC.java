class ABC {
    void m1() {
        System.out.println("in ABC m1()");
    }
    int x=30;
    static void m2() {
        System.out.println("In ABC m2()");
    }
}

class XYZ extends ABC {
    void m1() {
        System.out.println("In XYZ m1()");
    }
    static void m2() {
        System.out.println("In XYZ m2()");
    }
}

class Topclass{
    public static void main(String[] args) {
        // ABC abc=new ABC();
        // abc.m1();
        // ABC.m2();
        ABC obj=new XYZ();
        obj.m2();
        obj.m1();

        XYZ obj2=new XYZ();
        obj2.m2();
    
    }
}
