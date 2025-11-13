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