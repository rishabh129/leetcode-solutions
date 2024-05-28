class Solution
{
public:
    vector<int> intersect(vector<int> &nums1, vector<int> &nums2)
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
        int count1[maxN + 1];
        int count2[maxN + 1];

        for (int i = 0; i < maxN + 1; i++)
        {
            count1[i] = 0;
            count2[i] = 0;
        }
        for (int i = 0; i < size1; i++)
        {
            count1[nums1[i]] += 1;
        }
        for (int i = 0; i < size2; i++)
        {
            count2[nums2[i]] += 1;
        }
        vector<int> ans;

        for (int i = 0; i < maxN + 1; i++)
        {
            int times = min(count1[i], count2[i]);

            for (int j = 0; j < times; j++)
            {
                ans.push_back(i);
            }
        }
        return ans;
    }
};