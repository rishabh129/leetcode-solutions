class Solution
{
public:
    void tSum(vector<int> &nums, vector<int> temp, int index, int target, vector<vector<int>> &ans)
    {
        if (target == 0)
        {
            ans.push_back(temp);
            return;
        }
        if (index == nums.size())
        {
            return;
        }
        if (nums[index] <= target)
        { // if the number is less than target
            temp.push_back(nums[index]);
            tSum(nums, temp, index, target - nums[index], ans); // we can use the same number again
            temp.pop_back();
        }
        tSum(nums, temp, index + 1, target, ans); // we can't use the same number again
    }
    vector<vector<int>> combinationSum(vector<int> &candidates, int target)
    {
        vector<vector<int>> ans;
        tSum(candidates, {}, 0, target, ans);
        return ans;
    }
};