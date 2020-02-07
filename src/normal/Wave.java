package normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wave {
    public static String[] wave(String str) {

        String[] words = str.split(" ");
        List list = new ArrayList();
        for(int i =0;i<str.length();i++){
            char[] c = str.toCharArray();
            if(c[i]==' ') continue;
            c[i] = Character.toUpperCase(c[i]);
            list.add(String.valueOf(c));
        }
        return (String[]) list.stream().toArray(String[]::new);
    }
}
