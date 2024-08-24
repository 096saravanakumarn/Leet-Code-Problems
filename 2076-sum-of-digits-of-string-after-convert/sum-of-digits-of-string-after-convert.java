import java.util.*;
import java.math.BigInteger;
class Solution {
    public int getLucky(String s, int k) {
        String st = "";
        for(int i=0;i<s.length();i++){
             st += Integer.toString((s.charAt(i)-'a')+1);
        }
        BigInteger num = new BigInteger(st);
        BigInteger sum ;
       for(int i=0;i<k;i++){
        sum  = BigInteger.ZERO;
            while(num.compareTo(BigInteger.ZERO) != 0){
                BigInteger a = num.mod(BigInteger.TEN);
                sum = sum.add(a);
                num = num.divide(BigInteger.TEN);
            }
            num = sum;
        }
        int l = num.intValue();
        return l; 
    }
}