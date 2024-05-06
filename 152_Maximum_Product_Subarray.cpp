// Kadane's Algo

class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int maxL = INT_MIN, maxR =INT_MIN, currProd=1;
        
        for(auto i:nums){
            currProd*=i;
            maxL = max(maxL, currProd);
            if(i==0)
            currProd=1;
        }
        currProd=1;
        for(int i=nums.size()-1;i>=0;i--){
            currProd*=nums[i];
            maxR = max(maxR, currProd);
            if(nums[i]==0)
            currProd=1;
        }

        return max(maxL, maxR);
    }
};