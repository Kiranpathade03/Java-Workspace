// // 09 Jan 2024
// /**
//  * Inheritancetwo
//  */
// class Parent {

//   static int a = 122;

//   void m1() {
//     System.out.println("in m1()");
//   }

//   static {
//     System.out.println("In Static block Parent");
//   }

//   Parent() {
//     System.out.println("In Parent constctor");
//   }

// }

// public class Inheritancetwo extends Parent {
//   static {
//     System.out.println("In static child block");
//   }

//   Inheritancetwo() {
//     System.out.println("In Child Constuctor");
//   }

//   public static void main(String[] args) {
//     Inheritancetwo obj2 = new Inheritancetwo();
//     // Parent.a = 12;
//     // System.out.println(a);
     
//     obj2.m1();


//   }

// }