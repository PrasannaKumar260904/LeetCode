class Solution {
    public int maxProfit(int[] prices) {
        // int n=prices.length;
        // int minprice=Integer.MAX_VALUE;
        // int maxprofit=0;

        // for(int i=0;i<n;i++){
        //     minprice=Math.min(minprice,prices[i]);
        //     maxprofit=Math.max(maxprofit,prices[i]-minprice);
        // }
        // return maxprofit;
        //sliding window approach
        int maxProfit=0;
        int left=0;
        int right=1;
        while(right<prices.length){
            if(prices[right]>prices[left]){
                int profit=prices[right]-prices[left];
                maxProfit=Math.max(maxProfit,profit);
            }else{
                left=right;
            }
            right++;
        }
        return maxProfit;

        
    }
}