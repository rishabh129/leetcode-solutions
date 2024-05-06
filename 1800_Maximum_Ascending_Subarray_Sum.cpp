//Kadane's Algo
class Solution {
public:
    int maxAscendingSum(vector<int>& nums) {
        int maxS=INT_MIN, currSum=0, prev=nums[0];
        for(int i=0;i<nums.size();i++){
            if(nums[i] <= prev){
                currSum = nums[i];
            }
            else
            currSum+=nums[i];
            maxS =max(maxS, currSum);
            prev=nums[i];
        }
        return maxS;
    }
};