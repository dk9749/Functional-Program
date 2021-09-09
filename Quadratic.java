package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double delta, root1, root2;
        System.out.println("Enter First Number");
        a = sc.nextInt();
        System.out.println("Enter Second Number");
        b = sc.nextInt();
        System.out.println("Enter Third Number");
        c = sc.nextInt();

        delta = b * b - 4 * a * c;
        if (delta >= 0) {
            root1 = (-b + Math.sqrt(delta)) / 2 * a;
            root2 = (-b - Math.sqrt(delta)) / 2 * a;

            System.out.println("1st Root Of X Is: " + root1);
            System.out.println("2nd Root Of X Is: " + root2);
        } else {
            System.out.println("Value Of Delta Is Negative So Please Enter Valid Number!!(b>a>c)");
        }
    }
}