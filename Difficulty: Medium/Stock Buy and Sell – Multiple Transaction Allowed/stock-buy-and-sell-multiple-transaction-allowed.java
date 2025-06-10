// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        
        // int low,high,profit;
        int low = 0;
        int high = 0;
        int profit = 0;
        
        while(high < prices.length-1)
        {
            if(prices[high+1]>=prices[high])
            {
                high++;
            }
            else if(prices[high+1] < prices[high])
            {
                profit+=prices[high] - prices[low];
                low = high+1;
                high++;
            }
        }
        if(high > low)
        {
            profit+=prices[high] - prices[low];
            
        }
        return profit;
        
    }
}