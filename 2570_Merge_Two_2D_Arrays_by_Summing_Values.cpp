class Solution
{
public:
    vector<vector<int>> mergeArrays(vector<vector<int>> &nums1, vector<vector<int>> &nums2)
    {
        int maxN = 0;
        for (auto i : nums1)
        {
            maxN = max(maxN, i[0]);
        }
        for (auto i : nums2)
        {
            maxN = max(maxN, i[0]);
        }

        int count[maxN + 1];

        for (int i = 0; i < maxN + 1; i++)
        {
            count[i] = 0;
        }

        for (int i = 0; i < nums1.size(); i++)
        {
            count[nums1[i][0]] += nums1[i][1];
        }
        for (int i = 0; i < nums2.size(); i++)
        {
            count[nums2[i][0]] += nums2[i][1];
        }

        vector<vector<int>> ret;

        for (int i = 1; i < maxN + 1; i++)
        {
            if (count[i] == 0)
                continue;
            ret.push_back({i, count[i]});
        }
        return ret;
    }
};