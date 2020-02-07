package normal;

import java.util.ArrayList;
import java.util.List;

public class MaxProfit {
    public static int max(int[] prices, int k) {
        if(prices.length==0) return 0;
        int[][] profits = new int[k+1][prices.length];
        for(int t =1;t<k+1;t++){
            int maxThus = Integer.MIN_VALUE;
            for(int d=1;d<prices.length;d++){
                maxThus = Math.max(maxThus, profits[t-1][d-1] - prices[d-1]);
                profits[t][d] = Math.max(profits[t][d-1], maxThus + prices[d]);
            }
        }

        return profits[k][prices.length-1];
    }
}
