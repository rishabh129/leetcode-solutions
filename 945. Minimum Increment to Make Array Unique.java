class Solution {
    int sum(int num){
        int ad = 0;
        while(num!=0){
            ad+=num;
            num--;
        }
        return ad;
    }
    public int minIncrementForUnique(int[] nums) {
        int len = nums.length;
        int maxS=-1;
        for(int i=0;i<len;i++){
            maxS = nums[i]>maxS?nums[i]:maxS;
        }

        int count[] = new int[maxS+1];

        for(int i=0;i<maxS+1;i++){
            count[i] = 0;
        }

        for(int i=0;i<len;i++){
            count[nums[i]]++;
        }

        int ans=0;
        
        for(int i=0;i<maxS;i++){

            if(count[i]>1){
                count[i+1] += (count[i] - 1 );
                ans+=(count[i] - 1);
                count[i] = 1;
            }
        
        }
        ans+= (sum(count[maxS] - 1));
        return ans;
    }
}