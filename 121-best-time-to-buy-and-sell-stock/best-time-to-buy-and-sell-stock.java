class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length,profit=0,maxProfit=0,cur=prices[n-1];
        for(int i=n-2;i>=0;i--){
            if(cur<prices[i]){
                cur=prices[i];
            }
            profit=cur-prices[i];
            if(maxProfit<profit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}