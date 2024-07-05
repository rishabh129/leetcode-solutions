class Solution
{
public:
    int countPairs(vector<int> &nums, int target)
    {
        int count = 0;

        sort(nums.begin(), nums.end());

        for (int i = 0; i < nums.size() - 1; i++)
        {

            for (int j = i + 1; j < nums.size(); j++)
            {

                if (nums[i] + nums[j] < target)
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
        }
        return count;
    }
};

// solution 2 - 2 pointer

class Solution
{
public:
    int countPairs(vector<int> &nums, int target)
    {
        int count = 0;

        sort(nums.begin(), nums.end());

        int left = 0;
        int right = nums.size() - 1;

        while (left < right)
        {

            if (nums[left] + nums[right] < target)
            {
                count += right - left;
                left++;
                right = nums.size() - 1;
            }
            else
            {
                if (right - left == 1)
                {
                    break;
                }
                right--;
            }
        }

        return count;
    }
};