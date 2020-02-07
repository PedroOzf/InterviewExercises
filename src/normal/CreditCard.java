package normal;

public class CreditCard {
    public static String maskify(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i=0;i<s.length()-4;i++){
            sb.replace(i,i+1,"#");
        }

        return sb.toString();
    }
}
