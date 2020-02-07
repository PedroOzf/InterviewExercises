package normal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Enough {
    public static int[] delete(int[] a, int n) {
        HashMap<Integer,Integer> mapa = new HashMap<>();
        List lst = new ArrayList();
        for(Integer num:a){
            if(mapa.containsKey(num)){
                mapa.put(num,mapa.get(num)+1);
            }else{
                mapa.put(num,1);
            }
            if (mapa.get(num)<=n) lst.add(num);
        }

        return  lst.stream().mapToInt(i -> (int) i).toArray();
    }
}
