package normal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    public static String order(String s) {
        if(s.isEmpty()) return "";
        String[] toOrder = s.split(" ");
        List<String> list = new ArrayList<>();
        for (int i=0;i<=toOrder.length;i++){
            for(int j =0;j<toOrder.length;j++){
                if(toOrder[j].matches(".*"+i+".*")) list.add(toOrder[j]);
            }
        }
        return String.join(" ",list);

    }
}
