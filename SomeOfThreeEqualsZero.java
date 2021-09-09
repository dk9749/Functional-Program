package com.bridgelabz;

import java.util.Scanner;

public class SomeOfThreeEqualsZero {
    public static void triplets(int[] array, int n) {
        boolean flag = false;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.print(array[i] + "  ");
                        System.out.print(array[j] + "  ");
                        System.out.println(array[k]);
                        flag = true;
                    }
                }
            }
        }
        if (flag == false) {
            System.out.println("Not Exist");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        int n = array.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Five Negative And Positive Integer: ");

        for (int p = 0; p < array.length; p++) {
            array[p] = sc.nextInt();
        }
        triplets(array, n);
    }
}
