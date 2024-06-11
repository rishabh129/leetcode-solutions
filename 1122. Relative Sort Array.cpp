class Solution
{
public:
    vector<int> relativeSortArray(vector<int> &arr1, vector<int> &arr2)
    {
        int maxS = -1;

        for (int i = 0; i < arr1.size(); i++)
        {
            maxS = max(maxS, arr1[i]);
        }

        int count[maxS + 1];

        for (int i = 0; i < maxS + 1; i++)
        {
            count[i] = 0;
        }

        for (int i = 0; i < arr1.size(); i++)
        {
            count[arr1[i]]++;
        }

        vector<int> ans;

        for (int i = 0; i < arr2.size(); i++)
        {
            for (int j = 0; j < count[arr2[i]]; j++)
            {
                ans.push_back(arr2[i]);
            }
            count[arr2[i]] = 0;
        }

        for (int i = 0; i < maxS + 1; i++)
        {
            for (int j = 0; j < count[i]; j++)
            {
                ans.push_back(i);
            }
        }

        return ans;
    }
};