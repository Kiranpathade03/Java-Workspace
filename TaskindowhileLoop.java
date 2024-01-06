import java.util.Scanner;

public class TaskindowhileLoop {

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void Armstrong() {

    }

    static void InputArrayelement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        TaskindowhileLoop.ArraySum(array);
    }

    static void ArraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        System.out.println("Sum of Array of Element :" + sum);
    }

    void ReverseNumber(int Number) {
        int Ans = 0;
        while (Number != 0) {
            int remainder = Number % 10;
            Ans = Ans * 10 + remainder;
            Number = Number / 10;

        }
        System.out.println(Ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskindowhileLoop obj = new TaskindowhileLoop();
        char continuee = 0;
        do {
            System.out.println("Enter a 1 for Prime Number");
            System.out.println("Enter a 2 for Armstrong");
            System.out.println("Enter a 3 for InputArrayelement");
            System.out.println("Enter a 4 for Reverse");

            System.out.println("Enter a Your Choice");
            int ch = sc.nextInt();

            switch (ch) {
                case (1):
                    System.out.println("Enter a number");
                    int num = sc.nextInt();
                    if (isPrime(num)) {
                        System.out.println(num + " is a prime number.");
                    } else {
                        System.out.println(num + " is not a prime number.");
                    }
                    break;
                case (2):
                    System.out.println("Enter a number");

                    break;
                case (3):
                    System.out.println("Enter a length of Array");
                    int length = sc.nextInt();
                    int[] array = new int[length];
                    System.out.println("Enter a element");
                    for (int i = 0; i < array.length; i++) {
                        array[i] = sc.nextInt();
                    }
                    TaskindowhileLoop.InputArrayelement(array);

                    break;
                case (4):
                    System.out.println("Enter a number");
                    int Number = sc.nextInt();
                    obj.ReverseNumber(Number);
                    break;

                default:
                    System.out.println("Please Enter Valid Number");
                    break;
            }
            System.out.println("Do you want to Continuee..");
            continuee = sc.next().charAt(0);

        } while (continuee == 'y' || continuee == 'Y');
    }
}
