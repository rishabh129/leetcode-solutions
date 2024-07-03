class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4){
            return 0;
        }

        Arrays.sort(nums);
        int minD=Integer.MAX_VALUE;
        for(int i=0;i<4;i++){
            minD = Math.min(minD, nums[nums.length - 1 - (3-i)] - nums[i]);
        }
        return minD;
    }
}