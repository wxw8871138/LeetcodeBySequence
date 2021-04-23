package LeetCode;

public class Q121MaxStockProfit {
    //记录当前这天之前的最低买入价，当前这天的最大收益为当天价格-之前最低价。
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }else {
                res = Math.max(res,prices[i]-minPrice);
            }
        }
        return res;
    }

}
