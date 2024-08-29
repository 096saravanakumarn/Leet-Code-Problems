class Solution {
    public String replaceDigits(String s) {
        char ch[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String st = "";
        int t = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int v = Integer.parseInt(s.charAt(i)+"");
                st+=ch[t+v];
            }
            else{
                 t = (s.charAt(i)-'a');
                st+=s.charAt(i);
            }
        }
        return st;
    }
}