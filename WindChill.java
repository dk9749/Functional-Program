package com.bridgelabz;

import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double t, v, w;
        System.out.println("Enter Velocity: ");
        v = sc.nextInt();
        System.out.println("Enter Temperature: ");
        t = sc.nextInt();

        w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        System.out.println("The Wind Chill (ie. Effective Temperature) = " + w+" (in Fahrenheit)");

    }
}
