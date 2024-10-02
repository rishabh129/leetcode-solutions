class Solution
{
public:
    int majorityElement(vector<int> &nums)
    {
        sort(nums.begin(), nums.end());
        return nums[nums.size() / 2];
    }
};

// using Hashmap - Java

class Solution
{
public
    int majorityElement(int[] nums)
    {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            if (freq.containsKey(nums[i]))
            {
                int count = freq.get(nums[i]);
                freq.put(nums[i], count + 1);

                if ((count + 1) > (nums.length / 2))
                {
                    return nums[i];
                }
            }
            else
            {
                freq.put(nums[i], 1);
            }
        }
        return nums[0];
    }
}