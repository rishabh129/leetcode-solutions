class Solution {
    public double averageWaitingTime(int[][] customers) {
        double wait=0;
        int curr=0;
        int len = customers.length;

        for(int i=0;i<len;i++){

            int start = customers[i][0];
            int time = customers[i][1];

            if(curr<start){
                curr=start;
            }

            curr+=time;
            wait+=(curr-start);

        }
        return (double)wait/len;
    }
}