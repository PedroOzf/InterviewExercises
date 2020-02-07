package normal;

public class CountChars {
    public static String count(String str1,String str2){
        String res = "";
        String en = str1 + str2;
        for(char c = 'a'; c <= 'z';c++){
            if(en.contains(c+"")) res += c;
        }
        return res;
    }
}
