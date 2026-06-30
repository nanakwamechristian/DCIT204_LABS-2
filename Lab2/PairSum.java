package Lab2;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = input.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = input.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("\nPair found:");
                    System.out.println("Indices: " + i + ", " + j);
                    System.out.println("Values: " + arr[i] + ", " + arr[j]);
                    System.out.println("Equation: " + arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No pair found.");
        }
    }
}
