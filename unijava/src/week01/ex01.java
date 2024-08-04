package week01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            int fact = 1;

            // Calculate factorial
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }

            System.out.println("Factorial of " + number + " is: " + fact);
        } else {
            System.out.println("Enter a valid positive number!");
        }

        sc.close();
    }
}
