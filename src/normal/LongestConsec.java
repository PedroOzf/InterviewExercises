package normal;

public class LongestConsec {
    public static String longestConsec(String[] en, int n) {
        if(n==0 || n<0 || n>en.length) return "";
        String solucion ="";
        String intent = "";
        int a =0;
        for(int i=0;i<en.length-n+1;i++){
            if(i==en.length-1){
                intent = en[i];
                if(intent.length()>solucion.length()){
                    solucion = intent;
                }}
            else{
                intent="";
            while (a<n){
                intent += en[i+a];
                a++;
            }
            if(intent.length()>solucion.length()){
                solucion = intent;
            }
            a = 0;
        }}
        return solucion;
    }
}
