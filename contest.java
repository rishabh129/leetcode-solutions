// You are given an integer array nums and a non-negative integer k. A sequence of integers seq is called good if there are at most k indices i in the range [0, seq.length - 2] such that seq[i] != seq[i + 1].
/*
Return the maximum possible length of a good 
subsequence
 of nums.

 

Example 1:

Input: nums = [1,2,1,1,3], k = 2

Output: 4

Explanation:

The maximum length subsequence is [1,2,1,1,3].

Example 2:

Input: nums = [1,2,3,4,5,1], k = 0

Output: 2

Explanation:

The maximum length subsequence is [1,2,3,4,5,1].

*/ 


// solution

class Solution {
    public static int longestSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][][] dp = new int[n][n][k + 1];
        return dfs(nums, 0, n - 1, k, dp);
    }
    
    private static int dfs(int[] nums, int l, int r, int k, int[][][] dp) {
        if (l > r) return 0;
        if (dp[l][r][k] != 0) return dp[l][r][k];
        int res = 0;
        for (int i = l; i <= r; i++) {
            int cnt = 0;
            for (int j = l; j <= r; j++) {
                if (nums[j] == nums[i]) {
                    cnt++;
                    if (cnt > k) break;
                }
            }
            res = Math.max(res, cnt + dfs(nums, l, i - 1, k, dp) + dfs(nums, i + 1, r, k, dp));
        }
        return dp[l][r][k] = res;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,1,3};
        int k = 2;
        System.out.println(longestSubsequence(nums, k));
    }
}