package normal;

public class DigitalRoot {
    public static int getNum(int a) {
        String[] x = Integer.toString(a).split("");
        if(x.length==1) return Integer.parseInt(x[0]);
        int rec = 0;
        for(int i=0;i<x.length;i++){
            rec+=Integer.parseInt(x[i]);
        }
        return getNum(rec);
    }
}
