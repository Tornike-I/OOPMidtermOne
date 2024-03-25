package week3.tasks;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2 * i;
        }
        System.out.println("Sum = " + sum);


    }
}
