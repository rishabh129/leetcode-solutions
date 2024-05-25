class Solution
{
public:
    void ss(vector<int> &nums, vector<int> &temp, set<vector<int>> &ans, int i)
    {
        if (i == nums.size())
        {
            ans.insert(temp);
            return;
        }
        temp.push_back(nums[i]);
        ss(nums, temp, ans, i + 1);
        temp.pop_back();
        ss(nums, temp, ans, i + 1);
    }
    vector<vector<int>> subsetsWithDup(vector<int> &nums)
    {
        set<vector<int>> ans;
        vector<int> temp;
        sort(nums.begin(), nums.end());
        ss(nums, temp, ans, 0);

        vector<vector<int>> a(ans.begin(), ans.end());
        return a;
    }
};