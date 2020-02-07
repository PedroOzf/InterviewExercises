package normal;

public class RegularExpression {
    public static boolean regex(String str1, String str2) {
        if(str1 ==null || str2 == null){
            return false;
        }
        boolean[][] dp = new boolean[str1.length()+1][str2.length()+1];
        dp[0][0] = true;
        for(int i =0;i<str2.length();i++){
            if(str2.charAt(i) == '*' && dp[0][i-1]){
                dp[0][i+1] = true;
            }
        }

        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str2.charAt(j)=='.'){
                    dp[i+1][j+1] = dp[i][j];
                }

                if(str2.charAt(j)==str1.charAt(i)){
                    dp[i+1][j+1] = dp[i][j];
                }

                if(str2.charAt(j)=='*'){
                    if(str2.charAt(j-1)!=str1.charAt(i) && str2.charAt(j-1)!='.'){
                        dp[i+1][j+1] = dp[i][j];
                    } else {
                        dp[i+1][j+1] = (dp[i+1][j] || dp[i][j+1] || dp[i+1][j-1]);
                    }
                }
            }
        }
        return dp[str1.length()][str2.length()];
    }
}
