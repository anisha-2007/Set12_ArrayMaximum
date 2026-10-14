package com.lab;

public class App {

    public static int findMaximum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException(
                    "Array must not be empty");
        }

        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 45, 23, 89, 12};

        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("Maximum element: "
                + findMaximum(numbers));
    }
}