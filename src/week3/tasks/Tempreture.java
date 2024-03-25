package week3.tasks;

import java.util.Scanner;

public class Tempreture {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int tempreture = in.nextInt();
        if (tempreture < 0) {
            System.out.println("Freezing");
        } else if (tempreture <= 15) {
            System.out.println("Cold");

        } else if (tempreture <= 25) {
            System.out.println("Mild");

        } else if (tempreture <= 35) {
            System.out.println("Warm");

        } else {
            System.out.println("Hot");
        }

    }
}
