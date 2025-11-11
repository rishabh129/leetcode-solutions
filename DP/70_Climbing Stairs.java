// Recursion - TLE

class Solution {
    public int climbStairs(int n) {
        if(n<=1){
            return 1;
        }

        return climbStairs(n-1)+climbStairs(n-2);
    }
}


// DP - Memoization

class Solution {

    int climb(int n, int[] dp){

        if(n<=1){
            return 1;
        }
        if(dp[n]!=-1)
        return dp[n];

        return dp[n]=climb(n-1, dp)+climb(n-2, dp);
    }

    public int climbStairs(int n) {

        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++)
        dp[i]=-1;

        return climb(n, dp);
    }
}

// DP - Tabulation

class Solution {
    public int climbStairs(int n) {

        int[] dp = new int[n+1];
        for(int i=2;i<=n;i++)
        dp[i]=-1;

        dp[0]=dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}