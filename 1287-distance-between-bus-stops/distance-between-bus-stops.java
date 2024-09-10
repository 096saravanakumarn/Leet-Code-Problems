class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
         if(start>destination){
            int temp=start;
            start=destination;
            destination=temp;
        }
        int sum1 = 0;
        for(int i=start;i<destination;i++){
            sum1+=distance[i];
        }
        int sum2 = 0;
        for(int i=destination;i<distance.length;i++){
            sum2+=distance[i];
        }
        for(int i=0;i<start;i++){
            sum2+=distance[i];
        }
        return Math.min(sum1,sum2);
    }
}