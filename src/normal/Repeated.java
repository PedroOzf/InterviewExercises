package normal;

public class Repeated {
    public static boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder();

        int l = s.length();
        for(int i=l/2;i>=1;i--){
            if(l%i!=0) continue;
            String str = s.substring(0,i);
            int times = l/i;
            for(int x=0;x<times;x++){

                sb.append(str);
            }
            System.out.println(sb.toString());
            if(sb.toString().equals(s)) return true;
            sb.delete(0,sb.length());
        }
        return false;

    }
}
