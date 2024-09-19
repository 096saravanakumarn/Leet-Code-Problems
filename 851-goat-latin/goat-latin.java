class Solution {
    public String toGoatLatin(String sentence) {
        String st[] = sentence.split(" ");
        String a = "";
        for(int i=0;i<st.length;i++){
            if(st[i].charAt(0) == 'a' || st[i].charAt(0) == 'e' || st[i].charAt(0) == 'i' || st[i].charAt(0) == 'o' || st[i].charAt(0) == 'u' || st[i].charAt(0) == 'A' || st[i].charAt(0) == 'E' || st[i].charAt(0) == 'I' || st[i].charAt(0) == 'O' || st[i].charAt(0) == 'U'){
                String s = "m";
                for(int k=0;k<i+2;k++){
                        s+="a";
                    }
                for(int j=0;j<st[i].length();j++){ 
                    a += st[i].charAt(j); 
                }
                a += i!=st.length-1 ? s+" ":s;
            }
            else{
                String s = "m";
                String s1 = st[i].substring(1,st[i].length());
                    for(int k=0;k<i+2;k++){
                        s+="a";
                    }
                    a += i!=st.length-1 ? s1+st[i].charAt(0)+s+" ": s1+st[i].charAt(0)+s;
            }
        }
        return a;
    }
}