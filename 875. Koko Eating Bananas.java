class Solution {
    int calH(int[] piles, int count){
        int total=0;
        for(int i=0;i<piles.length;i++){
            total += Math.ceil((double) (piles[i]) / (double) count);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int low=1;
        int high=-1;
        for(int i=0;i<piles.length;i++){
            high = piles[i]>high?piles[i]:high;
        }
        while(low<=high){

            int mid = low + (high-low)/2;
            int totalH = calH(piles, mid);

            if(totalH <= h){
                high = mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return low;
    }
}