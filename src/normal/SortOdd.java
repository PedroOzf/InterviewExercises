package normal;

import java.util.ArrayList;
import java.util.List;

public class SortOdd {
    public static int[] sortArray(int[] ints) {
        List<Integer> posOdd = new ArrayList<>();
        for(int i=0;i<ints.length;i++){
            if(ints[i]%2!=0) posOdd.add(i);
        }
        int tmp=0;
        for(int i=0;i<posOdd.size();i++){
            for(int j =0;j < posOdd.size() -1 -i;j++){
                if(ints[posOdd.get(j)] > ints[posOdd.get(j+1)]){
                        tmp = ints[posOdd.get(j)];
                        ints[posOdd.get(j)] = ints[posOdd.get(j+1)];
                        ints[posOdd.get(j+1)] = tmp;
                    }
            }
        }
        return ints;
    }
}
