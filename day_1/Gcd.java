package day_1;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        calGcd(a,b);
    }

    private static void calGcd(int a, int b) {
        int gcd = 1;
        for(int i = 1; i<=a && i<=b ; i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println("GCD is "+ gcd);
    }
    
}
