package normal;

import java.util.ArrayList;
import java.util.List;

public class LeetCode {
    public List addTwoNumbers(List l1, List l2) {
        List ln = new ArrayList();
        int number = reverse(l1) + reverse(l2);
        while(number>0){
            ln.add(number%10);
            number /= 10;
        }
        return ln;
    }

    public int reverse(List l){
        int i = 0;
        for(int j=l.size()-1;j>=0;j--){
            int n = (int)l.get(j);
            i += n * Math.pow(10,j);
        }
        return i;
    }
}
