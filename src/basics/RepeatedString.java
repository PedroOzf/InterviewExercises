package basics;

public class RepeatedString {
    public static long repeat(String s, long i) {
        StringBuilder sb = new StringBuilder();
        if(s.length()==1){
            return i;
        }
        int times = (int)i / s.length();
        int mod = (int)i % s.length();
        int a = (int) s.chars().filter(ch -> ch =='a').count() * times;
        for(int x=0;x<mod;x++){
           if(s.charAt(x) =='a') a++;
        }

        return a;
    }
}
