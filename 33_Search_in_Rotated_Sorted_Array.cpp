// solution 1

class Solution
{
public:
    int search(vector<int> &nums, int target)
    {

        auto it = find(nums.begin(), nums.end(), target);
        if (it != nums.end())
        {
            return distance(nums.begin(), it);
        }
        else
            return -1;
    }
};

// solution 2 - recursion binary search

class Solution
{
public:
    int bSearch(vector<int> &nums, int si, int ei, int target)
    {
        if (si > ei)
            return -1;
        int mid = si + (ei - si) / 2;
        if (target == nums[mid])
            return mid;

        if (nums[si] <= nums[mid])
        {
            if (target >= nums[si] && target < nums[mid])
                return bSearch(nums, si, mid - 1, target);
            else
                return bSearch(nums, mid + 1, ei, target);
        }
        else
        {
            if (target <= nums[ei] && target > nums[mid])
                return bSearch(nums, mid + 1, ei, target);
            else
                return bSearch(nums, si, mid - 1, target);
        }
    }

    int search(vector<int> &nums, int target)
    {

        return bSearch(nums, 0, nums.size() - 1, target);
    }
};

// solution 3 - iterative binary search

class Solution
{
public:
    int search(vector<int> &nums, int target)
    {
        int si = 0, ei = nums.size() - 1;

        while (si <= ei)
        {
            int mid = si + (ei - si) / 2;

            if (target == nums[mid])
                return mid;

            if (nums[si] <= nums[mid])
            {
                if (target >= nums[si] && target < nums[mid])
                    ei = mid - 1;
                else
                    si = mid + 1;
            }
            else
            {
                if (target <= nums[ei] && target > nums[mid])
                    si = mid + 1;
                else
                    ei = mid - 1;
            }
        }
        return -1;
    }
};