package normal;

public class PhoneNumber {
    public static String createPhoneNumber(int[] ints) {
        if(ints.length != 10 ) return null;
        for(int i =0;i<ints.length;i++){
            if(10<ints[i] || 0 > ints[i]) return null;
        }
        StringBuilder sb = new StringBuilder("(");
        int cont = 0;
        for(int x=0;x<ints.length;x++){
            sb.append(ints[x]);
            cont++;
            if(cont==3) sb.append(") ");
            if(cont==6) sb.append("-");
        }
        return sb.toString();
    }
}
