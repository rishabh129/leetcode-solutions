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

//Tabulation

class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp, -1);
        dp[0]=nums[0];

        for(int i=1;i<n;i++){
            int notPick=dp[i-1];
            int pick=nums[i];
            if(i>1)
            pick+=dp[i-2];

            dp[i] = Math.max(pick, notPick);
        }
        return dp[n-1];
    }
}