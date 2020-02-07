package dynamicProgramming;

public class ZerosOnes {
    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];

        for(String s : strs){
            int[] curr = getZeroOne(s);
            for(int i = m; i >= curr[0]; i--){
                for(int j = n; j >= curr[1]; j--){
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i - curr[0]][j - curr[1]]);
                }
            }
        }
        return dp[m][n];
    }
    private static int[] getZeroOne(String s){
        int[] ret = new int[2];
        for(char c : s.toCharArray()){
            if(c == '0') ret[0]++;
            else ret[1]++;
        }
        return ret;
    }
}
