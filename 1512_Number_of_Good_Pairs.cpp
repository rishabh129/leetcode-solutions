class Solution
{
public:
    int numIdenticalPairs(vector<int> &nums)
    {
        int len = INT_MIN;
        for (auto i : nums)
        {
            len = max(len, i);
        }

        int check[len + 1];
        for (int i = 0; i < len + 1; i++)
        {
            check[i] = 0;
        }
        int count = 0;
        for (int i = 0; i < nums.size(); i++)
        {
            if (check[nums[i]] > 0)
            {
                count += check[nums[i]];
            }
            check[nums[i]]++;
        }
        return count;
    }
};