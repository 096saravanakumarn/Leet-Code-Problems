import java.util.*;
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for(int bill:bills){
            int amount = bill-5;
            int twentyNeed = Math.min(amount/20 , twenty);
            amount-=twentyNeed*20;
            twenty-=twentyNeed;
            int tenNeed = Math.min(amount/10, ten);
            amount-=tenNeed*10;
            ten-=tenNeed;
            int fiveNeed = Math.min(amount/5, five);
            amount-=fiveNeed*5;
            five-=fiveNeed;

            if(amount>0){
               return false;
            }
            if(bill == 20) twenty+=1;
            else if(bill == 10) ten+=1;
            else five+=1;
        }
            return true;
    }
}