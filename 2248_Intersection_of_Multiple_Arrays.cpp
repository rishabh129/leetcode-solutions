class Solution
{
public:
    vector<int> intersection(vector<vector<int>> &nums)
    {

        int rows = nums.size(), col = nums[0].size();
        int maxN = INT_MIN;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < nums[i].size(); j++)
            {
                maxN = max(maxN, nums[i][j]);
            }
        }

        int count[maxN + 1];

        for (int i = 0; i <= maxN; i++)
        {
            count[i] = 0;
        }

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < nums[i].size(); j++)
            {
                count[nums[i][j]]++;
            }
        }

        vector<int> ans;
        for (int i = 0; i <= maxN; i++)
        {
            if (count[i] == rows)
            {
                ans.push_back(i);
            }
        }

        return ans;
    }
};