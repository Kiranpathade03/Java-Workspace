class Thisparent {
    static {
        System.out.println();
    }
    int b=2;
    int a = 12;
    void add(int a) {
        // this.a=a;
        // System.out.println(this.a);
        // System.out.println(b);
        this.b=a;

    }
    void sub(){
        this.add(a);
    }
  
}

public class ThisKeyword extends Thisparent {
    int x=10;
    ThisKeyword(int a){
         
        this.x=a;
    }
    
    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword(20);

        System.out.println(obj.x);

        ThisKeyword obj2=new ThisKeyword(67);
       System.out.println( obj2.x);
 
        //  obj.add(6);
    }
}