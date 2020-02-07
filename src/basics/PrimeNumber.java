package basics;

public class PrimeNumber {
    public PrimeNumber(){}
    public boolean isPrime(double number){
        double sqr = Math.sqrt(number) + 1;
        for(int i=2; i < sqr ; i++){
            if (number%i==0) return false;
        }
        return true;
    }
}
