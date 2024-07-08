 
package Arrays;
public class BuyAndSell {
    public int maxProfit(int[] prices) {
      //step-1 : declared profit = 0 && buy = prices[0]
      int profit = 0;
      int buy = prices[0];

      //step-2 : Iterator over prices to find profit from index 1
      for (int i = 1; i < prices.length; i++) {
        //step-3 : check buy < prices[i] then buy = prices[i]
        if (prices[i]<buy) {
            buy = prices[i];
        }
        //step-4 : check profit < prices[i]-buy then profit = prices[i]-buy
        if (profit<prices[i]-buy) {
            profit = prices[i]-buy;
        }
      }
      return profit;
    }
public static void main(String[] args) {
    int prices[]={7,6,4,3,1};
    int profit = new BuyAndSell().maxProfit(prices);
    System.out.println(profit);
}
    
}