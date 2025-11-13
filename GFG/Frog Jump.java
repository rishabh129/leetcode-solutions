//Recursion

class Solution {
    int f(int n, int[] ar){
        if(n==0)
        return 0;

        int left = f(n-1, ar) + Math.abs(ar[n]-ar[n-1]);
        int right=999;
        if(n>1)
        right = f(n-2, ar) + Math.abs(ar[n]-ar[n-2]);
        return Math.min(left, right);
    }
    int minCost(int[] height) {
        // code here
        return f(height.length-1, height);
    }
}

//Memoization
class Solution {
    int f(int n, int[] ar, int[] dp){
        if(n==0)
        return 0;
        if(dp[n]!=-1)
        return dp[n];

        int left = f(n-1, ar, dp) + Math.abs(ar[n]-ar[n-1]);
        int right=Integer.MAX_VALUE;
        if(n>1)
        right = f(n-2, ar, dp) + Math.abs(ar[n]-ar[n-2]);
        return dp[n]=Math.min(left, right);
    }
    int minCost(int[] height) {
        // code here
        int[] dp=new int[height.length+1];
        for(int i=0;i<dp.length;i++)
        dp[i]=-1;
        return f(height.length-1, height, dp);
    }
}

//Tabulation

class Solution {
    int minCost(int[] height) {
        // code here
        if(height.length==1)
        return 0;
          
        int[] dp=new int[height.length+1];
        dp[0]=0;
        dp[1]=Math.abs(height[1]-height[0]);
        
        for(int i=2;i<height.length;i++){
            dp[i] = Math.min(dp[i-1]+Math.abs(height[i]-height[i-1]), dp[i-2]+Math.abs(height[i]-height[i-2]));
            
        }
        return dp[height.length-1];
    }
}

//Space Optimization

class Solution {
    int minCost(int[] height) {
        // code here
        if(height.length==1)
        return 0;
          
        int prev2=0;
        int prev=Math.abs(height[1]-height[0]);
        
        for(int i=2;i<height.length;i++){
            int curr = Math.min(prev+Math.abs(height[i]-height[i-1]), prev2+Math.abs(height[i]-height[i-2]));
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}