class Solution {
    public String capitalizeTitle(String title) {
        String st[] = title.split(" ");
        String str = "";
        for(int i=0;i<st.length;i++){
            for(int j=0;j<st[i].length();j++){
                if(Character.isUpperCase(st[i].charAt(j))){
                    str+=Character.toLowerCase(st[i].charAt(j));
                }
                else
                    str+=st[i].charAt(j);
            }
            str+=" ";
        }
        String st1[] = str.split(" ");
        String s1 = "";
        for(int i=0;i<st1.length;i++){
            for(int j=0;j<st1[i].length();j++){
                if(j==0 && st1[i].length()>2){
                    s1+=Character.toUpperCase(st1[i].charAt(j));
                }
                else
                    s1+=st1[i].charAt(j);
            }
            if(i!=st1.length-1)
            s1+=" ";
        }
        return s1;
    }
}