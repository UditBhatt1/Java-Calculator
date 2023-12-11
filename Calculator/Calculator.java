package Calculator;

import java.util.Scanner;

public class Calculator {
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Addition of two numbers.");
        System.out.println("2.Substration of two numbers.");
        System.out.println("3.Muliplication of two numbers.");
        System.out.println("4.Division of two numbers.");
        System.out.println("5.Exit.");
        System.out.print("Enter your choice: ");

        int input = scan.nextInt();

        switch (input) {
            case 1:
                addition();
                break;
            case 2:
                substraction();
                break;
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            default:
                System.out.println("Exited the program");
                break;

        }
    }

    public void addition() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = scan.nextInt();

        System.out.println("Enter the value of b: ");
        int b = scan.nextInt();

        int c = a + b;
        System.out.println("The addition of " + a + " + " + b + " is: " + c);
    }

    public void substraction() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = scan.nextInt();

        System.out.println("Enter the value of b: ");
        int b = scan.nextInt();

        int c = a - b;
        System.out.println("The substraction of " + a + " - " + b + " is: " + c);
    }

    public void multiplication() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = scan.nextInt();

        System.out.println("Enter the value of b: ");
        int b = scan.nextInt();

        int c = a * b;
        System.out.println("The multiplication of " + a + " * " + b + " is: " + c);
    }

    public void division() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        float a = scan.nextFloat();

        System.out.println("Enter the value of b: ");
        float b = scan.nextFloat();

        if (b != 0) {
            float c = a / b;
            System.out.println("The division of " + a + " / " + b + " is: " + c);
        } else
            System.out.println("Cannot divide by zero");
    }
}
