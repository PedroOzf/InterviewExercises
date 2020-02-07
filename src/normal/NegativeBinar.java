package normal;

import java.util.ArrayList;
import java.util.List;

public class NegativeBinar {
    public static int[] convert(int[] arr1, int[] arr2) {
        int a1,a2;
        a1 = toNeg(arr1);
        a2 = toNeg(arr2);
        String s = Integer.toBinaryString(a1+a2);
        int[] sol = new int[s.length()];
        for(int i =0;i<sol.length;i++){
            sol[i] = Character.getNumericValue(s.charAt(i));
        }
        return sol;
    }


    private static int toNeg(int[] arr1) {
        int ret = 0;
        int pow = arr1.length -1;
        for(int i:arr1){
            if(i==1){
                ret += Math.pow(-2,pow);
            }
            pow--;
        }
        return ret;
    }
}
