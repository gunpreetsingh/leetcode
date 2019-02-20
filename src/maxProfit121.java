/**
 * Created by singhgu on 2/8/2019.
 */
public class maxProfit121 {

    public static int maxProfit(int[] prices){

        if(prices.length == 0)
            return 0;

        int profit = 0;
        int bought = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] > bought){
                if(profit < prices[i] - bought)
                    profit = prices[i] - bought;
            }
            else
                bought = prices[i];
        }
        return profit;
    }
    public static void main(String[] args){System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));}
}
