package normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Permutations {

    public static ArrayList<String> singlePermutations(String ab) {
        ArrayList<String> list = new ArrayList<>();
       permute(ab,0,ab.length()-1,list);
        return list;
    }

    private static void permute(String ab, int i, int end,ArrayList<String> list) {
        if(i==end && !list.contains(ab)) list.add(ab);
        else{
            for(int x=i;x<=end;x++){
                ab = swap(ab,i,x);
                permute(ab,i+1,end,list);
                ab = swap(ab,i,x);

            }
        }
    }

    private static String swap(String ab, int i, int x) {
        char[] buf = ab.toCharArray();
        char tmp = buf[i];
        buf[i] = buf[x];
        buf[x] = tmp;
        return new String(buf);
    }
}
