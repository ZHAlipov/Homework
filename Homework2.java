import java.util.Scanner;

public class Homework2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task5();
    }

    public static void  task1() {
        System.out.println("Enter a value a:");
        int a = scanner.nextInt();
        System.out.println("Enter a value b:");
        int b = scanner.nextInt();
        
        if (a > b) {
            System.out.println("a > b");
        } else if ( a < b ) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    public static void  task2() {
        System.out.println("Enter a value a:");
        int a = scanner.nextInt();
        System.out.println("Enter a value b:");
        int b = scanner.nextInt();
        System.out.println("Enter a value c:");
        int c = scanner.nextInt();

        if ((a >= b) && (a >= c)) {
            System.out.println("a is the maximum value between others");
        } else if ((b >= a) && (b >= c)) {
            System.out.println("b is the maximum value between others");
        } else {
            System.out.println("c is the maximum value between others");
        }
    }

    public static void task3() {
        System.out.println("Enter a value:");
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("a is positive number");
        } else if (a < 0) {
            System.out.println("a is negative number");
        } else {
            System.out.println("a is zero");
        }
    }

    public static void task4() {
        System.out.println("Enter a number value:");
        int a = scanner.nextInt();

        if ((a % 5 == 0)  && (a % 11 == 0)) {
            System.out.println("This number divisibled by 5 and 11");
        } else {
            System.out.println("This number not divisibled by 5 and 11");
        }
    }

    public static void task5() {
        System.out.println("Enter a  number value:");



    }


}
