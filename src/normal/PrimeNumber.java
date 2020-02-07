package normal;

import java.math.BigInteger;

public class PrimeNumber {
    public static boolean isPrime(int i) {
        if(i<2) return false;
        double sq =  Math.sqrt(i);
        for(int x=2;x<=sq;x++){
            if(i%x==0) return false;
            //BigInteger.valueOf(i).isProbablePrime(20);
        }
        return true;
    }

    public static boolean isPrime2(int num){
        return num > 1 && BigInteger.valueOf(num).isProbablePrime(20);
    }
}
