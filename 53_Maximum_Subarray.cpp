// Kadane's Algorithm
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxS = INT_MIN, sum=0;
        for(int i=0;i<nums.size();i++){
            sum = max(nums[i], sum+nums[i]);
            maxS = max(maxS,sum);
        }
        return maxS;
    }
};