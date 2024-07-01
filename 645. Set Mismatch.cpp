class Solution
{
public:
    vector<int> findErrorNums(vector<int> &nums)
    {
        vector<int> ans;
        sort(nums.begin(), nums.end());
        for (int i = 0; i < nums.size() - 1; i++)
        {
            if (nums[i] == nums[i + 1])
            {
                ans.push_back(nums[i]);
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.size(); i++)
        {
            sum += nums[i];
        }

        int aSum = (nums.size() * (nums.size() + 1)) / 2;

        ans.push_back(ans[0] + aSum - sum);

        return ans;
    }
};