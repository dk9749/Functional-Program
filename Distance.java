package com.bridgelabz;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = 0;
        int x2;
        int y1 = 0;
        int y2;
        double distance;
        System.out.println("Enter X-Coordinate: ");
        x2 = sc.nextInt();
        System.out.println("Enter Y-Coordinate: ");
        y2 = sc.nextInt();

        distance = (double) Math.sqrt(x2 * x2 + y2 * y2);

        System.out.println("Distance Between Given Points to Origin(0,0) Is: " + distance);

    }
}
