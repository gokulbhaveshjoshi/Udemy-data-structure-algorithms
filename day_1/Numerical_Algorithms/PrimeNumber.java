package day_1.Numerical_Algorithms;

public class PrimeNumber {
    public static void primeNumber(int n){
        boolean[] is_prime = new boolean[n+1];

        //set all values true
        for(int i = 0; i<=n; i++){
            is_prime[i] = true;
        }

        //Check number is prime or not
        for(int p = 2; p*p<=n; p++){
            if(is_prime[p] == true){
                for(int i = p*p; i<=n; i+=p){
                    is_prime[i] = false;
                }
            }
        }

        //print all prime numbers
        for(int i =2; i<=n; i++){
            if(is_prime[i] == true)
            {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        primeNumber(100);
        //time complexity is O(n*log(log n))
    }
    
}
