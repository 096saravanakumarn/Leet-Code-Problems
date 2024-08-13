class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int j = 0;
        int k = 0;
        for(String st : commands){
            if(st.equals("DOWN")){
                j++;
            }
            else if(st.equals( "RIGHT")){
                k++;
            }
            else if(st.equals("UP")){
                j--;
            }
            else if(st.equals("LEFT")){
                k--;
            }
        }
        return (j*n+k);
    }
}