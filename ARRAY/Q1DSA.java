// DSA QUESTION:
// Q1. Find the Largest and Smallest Element in an Array
//
// Given an array of integers, find and print:
// 1. The largest element
// 2. The smallest element
//
// Example:
// Input:
// 5
// 10 25 3 45 8
//
// Output:
// Largest element = 45
// Smallest element = 3
//
// Constraint:
// Use a single loop to find both values.

import java.util.Scanner;

public class Q1DSA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);

        sc.close();
    }
}