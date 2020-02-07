package basics;

public class PalindromeStr {
    public boolean isPalindrome(String string) {
        StringBuilder a = new StringBuilder();
        for(int i=string.length()-1;0<=i;i--){
            a.append(String.valueOf(string.charAt(i)));
        }
        if(a.toString().equals(string)) return true;
        return false;
    }
}
