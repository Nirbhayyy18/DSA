public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
         int[] prices = {7, 1, 5, 3, 6, 4};
         int maxi = Integer.MIN_VALUE;
         int res = 0;
         for(int i=0;i<prices.length-1;i++)
         {
            for(int j=i+1;j<prices.length;j++)
            {
                res = prices[j] - prices[i];
                maxi = Math.max(maxi, res);
            }
         }
         System.out.println(maxi);
    }
}
