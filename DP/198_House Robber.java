//Recursion - TLE

class Solution {
    int f(int n, int[] nums){
        if(n==0)
            return nums[n];
        if(n<0)
            return 0;

        int pick=nums[n]+f(n-2, nums);
        int notPick=f(n-1, nums);
        return Math.max(pick, notPick);
        
    }
    public int rob(int[] nums) {
       
        return f(nums.length-1, nums);
    }
}