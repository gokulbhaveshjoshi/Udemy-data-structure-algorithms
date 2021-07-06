package day_1.Array;

import java.util.Scanner;

public class TrianglularArray {
    public static void main(String[] args) {
        int n = 4;
        int[][] distance = new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance");

        // insert element into array
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    distance[i][j] = distance[j][i] = 0;
                } else {
                    System.out.println("Distance between " + i + " and " + j);
                    distance[i][j] = distance[j][i] = sc.nextInt();
                }
            }
        }
        sc.close();

        // Display array
        for (int i = -1; i < n; i++) {
            for (int j = -1; j < n; j++) {
                if (i == -1) {
                    System.out.print("*" + "\t");
                } else {
                    if (i > -1 && j == -1) {
                        System.out.print("*" + "\t");
                    } else {
                        System.out.print(distance[i][j] + "\t");
                    }
                }
            }
            System.out.println();
        }
    }

}
