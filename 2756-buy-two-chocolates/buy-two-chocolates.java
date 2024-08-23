import java.util.*;
class Solution {
    public int buyChoco(int[] prices, int money) {
        int max = 0;
        int c = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<money)
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]+prices[j] <= money){
                    int t =   money-(prices[i]+prices[j]);
                    max = Math.max(max,t);
                    c++;
                }
            }
        }
        
        return c!=0?max:money;
    }
}