package dynamicProgramming;

public class Zeros {
    public static int check(String[] strs, int m,int n){
        int[][] dp = new int[m+1][n+1];

        for(String s:strs){
            int[] count = getZ(s);
            for(int i=m;i>=count[0];i--){
                for(int j=n;j>=count[1];j--){
                    dp[i][j] = Math.max(dp[i][j],1+dp[i-count[0]][j-count[1]]);
                }
            }
        }
        return dp[m][n];
    }

    private static int[] getZ(String s) {
        int[] ret = new int[2];
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') ret[0]++;
            else{
                ret[1]++;
            }
        }
        return ret;
    }
}
