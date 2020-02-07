package normal;

public class GoogleInt {
    public static int[] sort(int[] en){
        int start = 0, end = en.length-1;
        while(start<en.length){
            if(en[start]>en[start+1]){ continue;}
            start++;
        }
        while(end>0){
            if(en[end] < en[end-1]){ continue;}
            end++;
        }
        int[] sol = {start,end};
        return sol;
    }
}
