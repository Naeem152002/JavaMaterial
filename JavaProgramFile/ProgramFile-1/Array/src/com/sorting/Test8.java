package com.sorting;

public class Test8 {

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) { // Set the range to 1000 or as needed
        	int sum = 0; // Reset sum for each number

            for (int j = 1; j < i; j++) { // Find divisors of the number
                if (i % j == 0) {
                    sum += j; // Add divisor to the sum
                }
            }

            if (sum == i) {
                System.out.println(i + " is a perfect number"); // Print perfect number
            }
        }
    }
}
