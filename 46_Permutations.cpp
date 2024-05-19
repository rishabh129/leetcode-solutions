// Backtracking

class Solution
{
public:
    void pmt(vector<int> &nums, vector<int> temp, vector<vector<int>> &ans)
    {
        if (nums.size() == 0)
        {
            ans.push_back(temp);
            return;
        }

        for (int i = 0; i < nums.size(); i++)
        {

            vector<int> rm = nums;
            rm.erase(rm.begin() + i);
            temp.push_back(nums[i]);
            pmt(rm, temp, ans);
            temp.pop_back();
        }
    }

    vector<vector<int>> permute(vector<int> &nums)
    {
        vector<vector<int>> ans;

        pmt(nums, {}, ans);
        return ans;
    }
};