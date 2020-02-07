package normal;

public class Digits {
    public static int digPow(int num, int ex) {
//        int power = lenght(num) + ex;
//        int sum = 0;
//        int tmp = num;
//        while(tmp>0){
//            sum += Math.pow(tmp%10,power);
//            power--;
//            tmp /= 10;
//        }
//        if(sum%num==0) return sum/(num);
//        else return -1;
        String numStr = String.valueOf(num);
        int sum = 0;
        for(int i =0;i<numStr.length();i++,ex++)
            sum += Math.pow(Character.getNumericValue(numStr.charAt(i)),ex);
        return (sum%num==0) ? sum/num : -1;
    }

    private static int lenght(int num) {
        int le = 0;
        while(num>0){
            num /= 10;
            le++;
        }
        return le-1;
    }
}
