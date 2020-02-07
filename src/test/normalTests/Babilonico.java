package test.normalTests;

public class Babilonico {
    public static boolean sqr(int x){
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        return r*r == x;
    }
}
