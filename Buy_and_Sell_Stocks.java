import java.util.*;

public class Buy_and_Sell_Stocks{

    public static int max_profit(int prices[]) {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(buy_price < prices[i]) {
                int profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            }
            else {
                buy_price =  prices[i];
            }
        }
        return max_profit;
    }
    
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4}; 
        System.out.println("MAXIMUM PROFIT =  " + max_profit(prices));
    }
}
