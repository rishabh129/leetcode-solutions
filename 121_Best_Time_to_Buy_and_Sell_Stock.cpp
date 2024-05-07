class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int len = prices.size(); // length of the array

        if(len==1 || (len==2 && prices[0]>prices[1])) // if array has only one element or if the array has only two elements and the first element is greater than the second element
        return 0;

        if(len==2) // if the array has only two elements and the first element is less than the second element
        return prices[1]-prices[0];

        int leftMin[len], maxProfit=0;
        leftMin[1] = prices[0];

        for(int i=2;i<len;i++){ // finding the minimum element on the left side of the current element
            leftMin[i] = min(leftMin[i-1], prices[i-1]);
        }
        
        for(int i=1;i<len;i++){ // finding the maximum profit
            maxProfit = max( prices[i] - leftMin[i], maxProfit );
        }
        return maxProfit;
    }
};