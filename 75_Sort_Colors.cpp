class Solution
{
public:
    void sortColors(vector<int> &nums)
    {
        int c0 = 0, c1 = 0, c2 = 0;

        for (auto i : nums)
        {
            if (i == 0)
                c0++;
            else if (i == 1)
            {
                c1++;
            }
            else
                c2++;
        }
        nums.clear();
        for (int i = 1; i <= c0; i++)
        {
            nums.push_back(0);
        }
        for (int i = 1; i <= c1; i++)
        {
            nums.push_back(1);
        }
        for (int i = 1; i <= c2; i++)
        {
            nums.push_back(2);
        }
    }
};