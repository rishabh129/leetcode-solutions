class Solution {
    int sum(int n){
        if(n==1 || n==0){
            return n;
        }

        return sum(n-1)+sum(n-2);
    }
    public int fib(int n) {
        return sum(n);
    }
}