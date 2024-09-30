import java.math.BigInteger;
class Solution {
    public String removeDigit(String number, char digit) {
        List<BigInteger> list = new ArrayList<>();
        for(int i=0;i<number.length();i++){
            StringBuilder sb = new StringBuilder(number);
            if(number.charAt(i) == digit){
                sb.deleteCharAt(i);
                list.add(new BigInteger(sb.toString()));
            }
        }
        BigInteger b1 = Collections.max(list);
        return b1.toString();
    }
}