class Solution
{
public:
    vector<int> intersection(vector<int> &nums1, vector<int> &nums2)
    {
        int size1 = nums1.size();
        int size2 = nums2.size();

        int maxN = -1;

        for (int i = 0; i < size1; i++)
        {
            maxN = max(maxN, nums1[i]);
        }

        for (int i = 0; i < size2; i++)
        {
            maxN = max(maxN, nums2[i]);
        }
        int count[maxN + 1];

        for (int i = 0; i < maxN + 1; i++)
        {
            count[i] = 0;
        }
        for (int i = 0; i < size1; i++)
        {
            count[nums1[i]] = 1;
        }
        for (int i = 0; i < size2; i++)
        {
            if (count[nums2[i]] > 0)
            {
                count[nums2[i]]++;
            }
        }
        vector<int> ans;

        for (int i = 0; i < maxN + 1; i++)
        {
            if (count[i] >= 2)
            {
                ans.push_back(i);
            }
        }
        return ans;
    }
};