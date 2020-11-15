package me.ups3t.leetcodestuffs.challenges.easy.buy_and_sell_stock;

public class BuyAndSellStock {

    public int maxProfit(int[] prices) {

        if(prices.length<2) return 0;

        int profit = 0;

        for(int i = 0; i < prices.length; i++) {
            int buy = prices[i];
            for(int j = i+1; j < prices.length; j++) {
                int sell = prices[j];

                if(sell > buy && sell - buy > profit) profit = sell - buy;
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        BuyAndSellStock stock = new BuyAndSellStock();
        System.out.println(stock.maxProfit(new int[] {7,1,5,3,6,4}));
    }

}
