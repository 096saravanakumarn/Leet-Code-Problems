class Solution {
    public String capitalizeTitle(String title) {
        String st[] = title.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i=0;i<st.length;i++){
            for(int j=0;j<st[i].length();j++){
                if(Character.isUpperCase(st[i].charAt(j))){
                    str.append(Character.toLowerCase(st[i].charAt(j)));
                }
                else
                    str.append(st[i].charAt(j));
            }
            str.append(" ");
        }
        String st1[] = str.toString().split(" ");
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<st1.length;i++){
            for(int j=0;j<st1[i].length();j++){
                if(j==0 && st1[i].length()>2){
                    s1.append(Character.toUpperCase(st1[i].charAt(j)));
                }
                else
                    s1.append(st1[i].charAt(j));
            }
            if(i!=st1.length-1)
            s1.append(" ");
        }
        return s1.toString();
    }
}