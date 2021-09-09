package com.bridgelabz;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int m, n, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number Of Rows: ");
        m = sc.nextInt();

        System.out.println("Enter The Number Of Column: ");
        n = sc.nextInt();

        int array[][] = new int[m][n];

        System.out.println("Enter The Elements Of array: ");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                array[i][j] = sc.nextInt();
        System.out.println("Elements Of The Array Are: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}