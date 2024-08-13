class Solution {
    public boolean canAliceWin(int[] nums) {
        int s1=0,s2=0;
        for(int i:nums)
        {
            if(i>=0 && i<=9)
                s1+=i;
            else
                s2+=i;
        }
        if(s1==s2)
            return false;
        return true;
    }
}