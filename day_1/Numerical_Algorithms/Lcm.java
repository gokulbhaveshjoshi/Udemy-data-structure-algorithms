package day_1.Numerical_Algorithms;
public class Lcm {
    public static void main(String[] args) {
        int a = 12, b = 15;
        calLCM(a, b);
    }

    private static void calLCM(int a, int b) {
        int lcm = a>b?a:b;
        while(true){
            if(lcm % a == 0 && lcm % b==0){
                System.out.println("LCM is "+lcm);
                break;
            }
            ++lcm;

        }
    }
    
}
