public class maxProfit {
    public int maxProfit(int[] prices) {
        //sliding window
        int minprice = prices[0];
        int maxprofit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }
            else if(maxprofit < prices[i]-minprice){
                maxprofit = prices[i]-minprice;
            }
        }
        return maxprofit;

    }
}
