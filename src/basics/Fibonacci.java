package basics;

public class Fibonacci {
    public int getFib(int i) {
        if(i==0){
            return 1;
        }else if(i==1){
            return 1;
        }else{
            return getFib(i-1) + getFib(i-2);
        }
    }
}
