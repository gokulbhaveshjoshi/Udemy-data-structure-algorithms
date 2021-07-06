package day_1.Array;

public class Variance {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5,6,7,8,9,10};
        float mean = calMean(values);
        calVariance(mean, values);
    }

    private static void calVariance(float mean, int[] values) {
        float sum = 0; 
        int n = values.length;
        for(int i = 0; i<n; i++){
            sum += (values[i] - mean) * (values[i] - mean);
        }

        System.out.println("Variance is " + (sum/(n-1)));
    }

    private static float calMean(int[] values) {
        float sum = 0;
        for(int i = 0; i<values.length; i++){
            sum += values[i];
        }
        return sum/values.length;
    }
    
}
