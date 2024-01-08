import java.util.Scanner;

class Parent {
    int a = 12;
    static int b = 23;

    void add(int a, int b) {
        int ans = a + b;
        System.out.println(ans);
    }

    static void sub(int a, int b) {
        int ans = a - b;
        System.out.println(ans);
    }
}

public class Inheritance  {
    public static void main(String[] args) {
        Parent obj = new Parent();
        Scanner sc = new Scanner(System.in);
        Parent obj2=new Parent();
        System.out.println("Enter a value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        obj2.a=123;
        System.out.println( " edited"+ obj2.a);
        System.out.println("obj1 edited"+ obj.a);
        
        obj.add(a, b);
        // Call the static method using the class name
        Parent.sub(a, b);
    }
}

