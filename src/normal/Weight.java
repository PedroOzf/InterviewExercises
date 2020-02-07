package normal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class Weight {
    public static String orderWeight(String toSort) {
        String[] as = toSort.split(" ");
        Arrays.sort(as);
        int[] lista = Stream.of(as).mapToInt(Integer::parseInt).toArray();
        int tmp = 0;
        for(int i=0;i<lista.length;i++){
            for(int j=0;j<lista.length -i-1;j++){
                if(weight(lista[j]) > weight(lista[j+1])){
                    tmp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = tmp;
                }
            }
        }
        return Arrays.toString(lista).replace("[", "").replace("]", "").replace(",","");
    }

    private static int weight(int i) {
        int num = 0;
        while(i > 0){
            num += i%10;
            i = i/10;
        }
        return num;
    }
}
