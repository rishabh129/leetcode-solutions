class Solution
{
public:
    int sum(int num)
    {
        int ad = 0;
        while (num != 0)
        {
            ad += num;
            num--;
        }
        return ad;
    }
    int minIncrementForUnique(vector<int> &nums)
    {
        int len = nums.size();
        int maxS = -1;
        for (auto i : nums)
        {
            maxS = max(maxS, i);
        }

        int count[maxS + 1];

        for (int i = 0; i < maxS + 1; i++)
        {
            count[i] = 0;
        }

        for (auto i : nums)
        {
            count[i]++;
        }

        int ans = 0;

        for (int i = 0; i < maxS; i++)
        {

            if (count[i] > 1)
            {
                count[i + 1] += (count[i] - 1);
                ans += (count[i] - 1);
                count[i] = 1;
            }
        }
        ans += (sum(count[maxS] - 1));
        return ans;
    }
};