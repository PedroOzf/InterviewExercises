package normal;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class CountingDuplicates {
    public static int count(String ex) {
        ex = ex.toLowerCase();
        int sol = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        char[] chars = ex.toCharArray();
        for(int i=0;i<ex.length();i++){
            char c = ex.charAt(i);
            if(!map.containsKey(c)) map.put(c,0);
            else{
                map.put(c,map.get(c)+1);
            }
        }
        for(Integer x :map.values()){
            if(x!=0) sol++;
        }
        return sol;
    }
}
