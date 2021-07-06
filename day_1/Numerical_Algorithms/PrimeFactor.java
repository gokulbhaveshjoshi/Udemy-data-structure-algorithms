package day_1.Numerical_Algorithms;

import java.util.Scanner;

public class PrimeFactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int i = 2;
        while(number>1){
            if(number%i==0){
                number = number / i;
                System.out.println(number + "  "+ i);
            }
            else{
                i++;
            }
        }
    }
    
}
