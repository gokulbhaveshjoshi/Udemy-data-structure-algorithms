package day_1.Numerical_Algorithms;

public class TrapezoidRule {
    public static void main(String[] args) {

        float a = 0, b = 1;
        int n = 6;
        System.out.println("Value of integral is " + Math.round(trapezoidRule(a, b, n) * 10000.0) / 10000.0);
        
    }

    public static float y(float x){
        return 1 / (1 + x * x);
    }

    public static float trapezoidRule(float a, float b, float n){
        // Calculate gird space
        float h = (b-a)/n;

        // Calculate the sum of first and last term
        float s = y(a) + y(b);

        // Adding middle term 
        for(int i =1; i<n; i++){
            s += 2 * y(a+i*h);
        }
        return (h/2) * s;
    }
    
}
