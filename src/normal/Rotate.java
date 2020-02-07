package normal;

import java.util.ArrayList;
import java.util.List;

public class Rotate {

    public static String revRot(String nums, int sz) {
        StringBuffer groups = new StringBuffer();
        for (int i = 0, len = nums.length(); i + sz <= len && sz > 0; i += sz) {
            String group = nums.substring(i, i + sz);
            groups.append(isDivisible(group) ? new StringBuffer(group).reverse() : group.substring(1) + group.charAt(0));
        }
        return groups.toString();
    }


    public static boolean isDivisible(String group) {
        int c = Character.getNumericValue(group.charAt(group.length()-1));
        return c % 2 == 0;
    }

}
