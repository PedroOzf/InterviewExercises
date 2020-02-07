package normal;

public class PermutNumbers {
    public static String nextBigger(String str) {
        int i=0;
        int z  =10;
        for(i = str.length()-1;i>=0;i--){
            if(str.charAt(i-1)< str.charAt(i)){
                i -= 1;
                break;
            }
            if(i==0) return null;
        }
        for(int j=str.length()-1;j>i;j--){
            if(str.charAt(j-1)<str.charAt(j)){
                z = j;
            }
        }


        return  swap(str,i,z);
    }

    private static String swap(String str, int i, int z) {
        char[] arr = str.toCharArray();
        char tmp = arr[i];
        arr[i] = arr[z];
        arr[z] = tmp;
        return new String(arr);
    }
}
