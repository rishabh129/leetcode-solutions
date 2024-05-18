// Backtraacking

class Solution
{
public:
    void ss(vector<int> &nums, vector<int> &temp, vector<vector<int>> &ans, int i)
    {
        if (i == nums.size())
        {
            ans.push_back(temp);
            return;
        }
        temp.push_back(nums[i]);
        ss(nums, temp, ans, i + 1);
        temp.pop_back();
        ss(nums, temp, ans, i + 1);
    }

    vector<vector<int>> subsets(vector<int> &nums)
    {
        vector<vector<int>> ans;
        vector<int> temp;
        ss(nums, temp, ans, 0);
        return ans;
    }
};