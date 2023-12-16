package hw2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for a: ");
        double a = scan.nextDouble();
        System.out.println("Enter value for b: ");
        double b = scan.nextDouble();
        System.out.println("Enter value for c: ");
        double c = scan.nextDouble();
        double result = (Math.abs(a - b) / Math.pow(a + b, 3) - Math.sqrt(c));
        System.out.println("The result of the equation is: "  + result);
    }
}
