package normal;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {
    public static List<Long> calc(long a, long b) {
        List<Long> result = new ArrayList<>();
        for(long i =a;i<=b;i++){
            if(isEureka(i)) result.add(i);
        }
        return result;
    }

    private static boolean isEureka(long i) {
        long tmp = i;
        long sum = 0;
        long power = lenght(i);
        while(tmp >0){
            sum+=Math.pow(tmp%10,power);
            tmp =tmp/10;
            power--;
        }
        return sum==i;

    }

    private static long lenght(long i) {
        int lenght = 0;
        while (i>0){
            i/=10;
            lenght++;
        }
        return lenght;
    }
}



//        int cen= 0,dec=0,ud = 0;
//        for(long i=a;i<b;i++){
//            if(i<10 && i >0){
//                result.add(i);
//            }else if(100>i && i>9){
//                if(i%100!=0) dec = (int)i/10;
//                ud = (int)i - dec*10;
//                if(Math.pow(dec,1) + Math.pow(ud,2) == i) result.add(i);
//            }else if(i>99 && i<200){
//                cen=(int) (i/100);
//                dec =(int) (i/10)%10;
//                ud =(int) (i - cen+1)%10;
//                if(Math.pow(cen,1) + Math.pow(dec,2) + Math.pow(ud,3) == i) result.add(i);
//            }
//
//        }
//        return result;