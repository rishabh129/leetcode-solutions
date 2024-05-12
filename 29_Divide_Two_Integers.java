class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==(-(1<<31)) && divisor==-1) //overflow case
        return (1<<31)-1;

        return dividend/divisor;
    }
}