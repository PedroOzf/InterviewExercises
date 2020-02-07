package normal;

public class CombineStrings {

    public boolean isValid(String str1, String str2, String str3) {
        if(str1.length() + str2.length() != str3.length()) return false;

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        int p1 =0,p2 = 0;
        for(char c : str3.toCharArray()){
            if(p1< array1.length && c == array1[p1]){
                p1++;
                continue;
            }else if(p2<array2.length && c == array2[p2]){
                p2++;
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
