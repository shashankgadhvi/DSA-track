class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int currentmin = 100000;
        int maxprofit=0;
        for(int i=0;i<n;i++){
            if(prices[i]<currentmin){
                currentmin = prices[i];
            }
            else{
                int currentprofit = prices[i]-currentmin;
                maxprofit = Math.max(currentprofit,maxprofit);
            }
        }
    return maxprofit;
    }
}