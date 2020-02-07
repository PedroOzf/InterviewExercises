package normal;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class JadenCase {
    public String toJadenCase(String str){
        if(str == null) return null;
        char[] cs = str.toCharArray();
        cs[0] = Character.toUpperCase(cs[0]);
        for(int i=0;i<str.length() -2;i++){
            if(cs[i] == ' ' || cs[i] == ',' || cs[i] == '.'){
                cs[i+1] = Character.toUpperCase(cs[i+1]);
            }
        }
        return new String(cs);
    }
}
