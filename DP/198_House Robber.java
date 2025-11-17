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

//Memoization

class Solution {
    int f(int n, int[] nums, int[] dp){
        if(n==0)
            return nums[n];
        if(n<0)
            return 0;

        if(dp[n]!=-1)
            return dp[n];

        int pick=nums[n]+f(n-2, nums, dp);
        int notPick=f(n-1, nums, dp);
        return dp[n]=Math.max(pick, notPick);
        
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp, -1);
        return f(nums.length-1, nums, dp);
    }
}