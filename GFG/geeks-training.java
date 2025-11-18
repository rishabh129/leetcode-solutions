//Ninja's training;

//Recursion - TLE
// User function Template for Java

class Solution {
    
    int f(int day, int last, int[][] task){
        if(day==0){
            int maxi=0;
            for(int i=0;i<=2;i++){
                if(i!=last)
                maxi=Math.max(maxi, task[0][i]);
            }
            return maxi;
        }
        
        int maxi=0;
        for(int i=0;i<=2;i++){
            if(i!=last){
                int point=task[day][i]+f(day-1, i, task);
                maxi=Math.max(maxi, point);
            }
        }
        return maxi;
    }
    
    public int maximumPoints(int arr[][]) {
        return f(arr.length-1, 3, arr);
        
    }
}

//Memoization - TLE

// User function Template for Java

class Solution {
    
    int f(int day, int last, int[][] task, int[][] dp){
        if(dp[day][last]!=-1)
        return dp[day][last];
        
        if(day==0){
            int maxi=0;
            for(int i=0;i<=2;i++){
                if(i!=last)
                maxi=Math.max(maxi, task[0][i]);
            }
            return dp[day][last]=maxi;
        }
        
        int maxi=0;
        for(int i=0;i<=2;i++){
            if(i!=last){
                int point=task[day][i]+f(day-1, i, task, dp);
                maxi=Math.max(maxi, point);
            }
        }
        return dp[day][last]=maxi;
    }
    
    public int maximumPoints(int arr[][]) {
        int n=arr.length;
        int[][] dp=new int[n][4];
        
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }
        
        return f(n-1, 3, arr, dp);
        
    }
}

