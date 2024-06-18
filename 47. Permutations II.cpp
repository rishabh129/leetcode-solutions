class Solution
{
public:
    void pmt(vector<int> &nums, vector<int> temp, set<vector<int>> &ans)
    {
        if (nums.size() == 0)
        {
            ans.insert(temp);
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
    vector<vector<int>> permuteUnique(vector<int> &nums)
    {
        set<vector<int>> ans;

        pmt(nums, {}, ans);
        vector<vector<int>> vc(ans.begin(), ans.end());
        return vc;
    }
};