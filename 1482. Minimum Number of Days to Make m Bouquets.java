class Solution {
    int calD(int[] bloomDay, int day, int k){

        int count=0;
        int total=0;

        for(int i=0;i<bloomDay.length;i++){
            
            
            if(bloomDay[i]<=day){
                count++;
            }
            else{
                count=0;
            }
            if(count==k){
                total++;
                count=0;
            }

        }
        return total;

    }
    public int minDays(int[] bloomDay, int m, int k) {
        
        int low = 1;
        int high=-1;
        int len = bloomDay.length;
        System.out.print(len);
        if(len/k<m){
            return -1;
        }
        for(int i=0;i<len;i++){
            high = bloomDay[i]>high?bloomDay[i]:high;
        }

        while(low<=high){

            int mid = low + (high-low)/2;
            int count = calD(bloomDay, mid, k);
            if(count>=m){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return low;
        
    }
}