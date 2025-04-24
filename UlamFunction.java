package com.mycompany.ulamfunctionjava;
import java.util.Scanner;

public class UlamFunctionJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        long n = scanner.nextLong();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.print("Ulam sequence: ");
            printUlamSequence(n);
        }

        scanner.close();
    }

    public static void printUlamSequence(long n) {
        while (n != 1) {
            System.out.print(n + " -> ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.println("1");
        System.out.println("The sequence terminates at 1.");
    }
}
