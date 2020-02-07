package normal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindLetter {
    public static char find(char[] array) {
        /**
        Character[] sol = new Character[str.length+1];
        int cont=0;
        for(char a = str[0];a<=str[str.length-1];a++){
            sol[cont] = a;
            cont++;
        }
        List<Character> listaVieja = Arrays.asList(str);

        Character[] arrayLimpio = Stream.of(sol).filter(i->!listaVieja.contains(i)).toArray(Character[]::new);
        System.out.println(arrayLimpio.length);
        return arrayLimpio[0];**/
        char expectableLetter = array[0];
        for(char letter : array){
            if(letter != expectableLetter) break;
            expectableLetter++;
        }
        return expectableLetter;
    }

    }

