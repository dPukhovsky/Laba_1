package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Number1();
        Number2();
        Number3();
        Number4();
        Number5();
    }

    private static void Number1() {
        System.out.println("Number 1");

        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("fizz");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static void Number2() {
        System.out.println("Number 2");

        String original = "make install";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println(original);
        System.out.println(reversed);
    }

    private static void Number3() {
        System.out.println("Number 3");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Real roots: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The only real root: " + root);
        } else {
            System.out.println("There are no real roots");
        }
    }

    private static void Number4() {
        System.out.println("Number 4");

        double sum = 0.0;
        int quantity = 1000000;

        for (int i = 2; i <= quantity; i++) {
            sum += 1.0 / (i * i + i - 2);
        }

        System.out.println(sum);
    }

    private static void Number5(){
        System.out.println("Number 5");

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the line: ");
        String line = (scanner.nextLine()).toLowerCase();

        if (IsPalindrome(line)) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
    }

    private static boolean IsPalindrome(String line){
        for (int i = 0; i < line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}