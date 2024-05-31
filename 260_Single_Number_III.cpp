class Solution
{
public:
    vector<int> singleNumber(vector<int> &nums)
    {
        if (nums.size() == 2)
            return nums;
        sort(nums.begin(), nums.end());
        int count = 0;
        vector<int> ans;
        for (int i = 0; i < nums.size() - 1; i++)
        {
            if (nums[i] == nums[i + 1])
            {
                count++;
            }
            else if (nums[i] != nums[i + 1])
            {
                if (count == 0)
                {
                    ans.push_back(nums[i]);
                }
                count = 0;
            }
        }
        if (count == 0)
        {
            ans.push_back(nums[nums.size() - 1]);
        }
        return ans;
    }
};