public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int j = 0; j < prices.length; j++) {
            if (prices[j] < min) {
                min = prices[j];
            }
            if (prices[j] - min > maxProfit) {
                maxProfit = prices[j] - min;
            }

        }
        return maxProfit;
    }
}
