// Solution 1 - Brute Force
// c++

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int len = 0;
        for(auto i:nums){
            len++;
        }
        

        for(int i=0;i<len-1;i++){
            
                for(int j=i+1;j<len;j++){
                    if(nums[i] + nums[j] == target){
                        
                        return {i,j};
                    }
                }
            
        }
        return {};

    }
};



// Solution 2 - Using HashMap

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target - nums[i])){
                return new int[] {hm.get(target-nums[i]), i};
            }
            hm.put(nums[i], i);
        }
        return new int[] {};
    }
}