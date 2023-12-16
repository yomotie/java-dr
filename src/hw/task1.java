package hw;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temporary = a;
        a = b;
        b = temporary;
        System.out.println("______________________");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter value for number a: ");
         a = scan.nextInt();
        System.out.println("Please enter value for number b: ");
         b = scan.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        temporary = a;
        a = b;
        b = temporary;
        System.out.println("______________________");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
