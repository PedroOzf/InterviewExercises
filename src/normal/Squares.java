package normal;

public class Squares {
    public static int calculate(int num){
        int x  =1;
        int tot = 0;
        int cont = -1;
        while(num>=x){
            x = rec(tot);
            tot = tot +2;
            cont++;
        }
        return cont;
    }
    public static int rec(int n){
        if(n<1) return 0;
        if(n==1) return 0;
        return n + rec(n-2);
    }
}
